package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Piano", "String", "Mahogany", "Black", "Concert Grand", 125000.00, 172000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Piano", piano.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("String", piano.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Mahogany", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetSize() {
        assertEquals("Concert Grand", piano.getSize());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Plink! Plonk! I'm a Piano!", piano.play(piano));
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(125000.00, piano.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(172000.00, piano.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(47000.00, piano.calculateMarkup(), 0.01);
    }

}
