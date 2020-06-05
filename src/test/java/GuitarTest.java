import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Guitar","String", "Rosewood", "Red", 6);
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

}
