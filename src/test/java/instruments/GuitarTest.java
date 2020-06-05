package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Guitar","String", "Rosewood", "Red", 6, 589.00, 699.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Rosewood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Brrrmmmmm! I'm a Guitar!", guitar.play(guitar));
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(589.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(699.99, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(110.99, guitar.calculateMarkup(), 0.01);
    }

}
