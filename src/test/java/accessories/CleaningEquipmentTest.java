package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CleaningEquipmentTest {

    CleaningEquipment cleaningEquipment;

    @Before
    public void before() {
        cleaningEquipment = new CleaningEquipment("Flute Flag", 29.00, 40.00);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Flute Flag", cleaningEquipment.getDescription());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(29.00, cleaningEquipment.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(40.00, cleaningEquipment.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(11.00, cleaningEquipment.calculateMarkup(), 0.01);
    }

}
