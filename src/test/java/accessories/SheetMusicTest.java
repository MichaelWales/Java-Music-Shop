package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Stairway to Heaven", 0.79, 1.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Stairway to Heaven", sheetMusic.getDescription());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(0.79, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(1.99, sheetMusic.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1.20, sheetMusic.calculateMarkup(), 0.01);
    }

}
