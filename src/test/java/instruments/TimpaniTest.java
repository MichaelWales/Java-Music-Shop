package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {

    Timpani timpani;

    @Before
    public void before() {
        timpani = new Timpani("Timpani", "Percussion", "Copper", "Bronze", "Friction", 2400.00, 3100.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Timpani", timpani.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Percussion", timpani.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Copper", timpani.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Bronze", timpani.getColour());
    }

    @Test
    public void canGetClutchType() {
        assertEquals("Friction", timpani.getClutchType());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("BOOM! BOOM! BOOM! I'm a Timpani!", timpani.play(timpani));
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(2400.00, timpani.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(3100.00, timpani.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(700.00, timpani.calculateMarkup(), 0.01);
    }

}
