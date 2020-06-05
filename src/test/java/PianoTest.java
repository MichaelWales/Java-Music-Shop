import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("String", "Mahogany", "Black", "Concert Grand");
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

}
