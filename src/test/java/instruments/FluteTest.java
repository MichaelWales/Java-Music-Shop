package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Flute", "Woodwind", "Gold", "Gold", 24, 30000.00, 48000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Flute", flute.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Woodwind", flute.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Gold", flute.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", flute.getColour());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(24, flute.getNumberOfKeys());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Tu-re-lu-re-lu! I'm a Flute!", flute.play(flute));
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(30000.00, flute.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(48000.00, flute.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(18000.00, flute.calculateMarkup(), 0.01);
    }

}
