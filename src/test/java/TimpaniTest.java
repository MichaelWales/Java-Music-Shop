import instruments.Timpani;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {

    Timpani timpani;

    @Before
    public void before() {
        timpani = new Timpani("Percussion", "Copper", "Bronze", "Friction");
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

}
