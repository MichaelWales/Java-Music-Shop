import instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Woodwind", "Gold", "Gold", 24);
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
}