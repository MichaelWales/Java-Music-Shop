import accessories.CleaningEquipment;
import instruments.Flute;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument flute;
    CleaningEquipment cleaningEquipment;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange", 65000.00);
        flute = new Flute("Flute", "Woodwind", "Gold", "Gold", 24, 30000.00, 48000.00);
        cleaningEquipment = new CleaningEquipment("Flute Flag", 29.00, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canCheckTillBalance() {
        assertEquals(65000.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void canSetTillBalance() {
        shop.setTillBalance(70000.00);
        assertEquals(70000.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockLevels());
    }

    @Test
    public void canBuyInstrument() {
        shop.buyInstrument(flute);
        assertEquals(1, shop.getStockLevels());
        assertEquals(35000.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void canSellInstrument() {
        shop.buyInstrument(flute);
        shop.sellInstrument(flute);
        assertEquals(0, shop.getStockLevels());
        assertEquals(83000.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void canBuyAccessory() {
        shop.buyAccessory(cleaningEquipment);
        assertEquals(1, shop.getStockLevels());
        assertEquals(64971.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void canSellAccessory() {
        shop.buyAccessory(cleaningEquipment);
        shop.sellAccessory(cleaningEquipment);
        assertEquals(0, shop.getStockLevels());
        assertEquals(65011.00, shop.getTillBalance(), 0.01);
    }

}
