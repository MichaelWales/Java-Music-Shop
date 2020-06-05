package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("80/20 Bronze Medium", 2.50, 6.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("80/20 Bronze Medium", guitarStrings.getDescription());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(2.50, guitarStrings.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6.99, guitarStrings.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.49, guitarStrings.calculateMarkup(), 0.01);
    }


}
