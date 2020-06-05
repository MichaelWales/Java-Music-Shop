package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {

    Bag bag;

    @Before
    public void before() {
        bag = new Bag("Guitar case", 24.00, 34.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Guitar case", bag.getDescription());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(24.00, bag.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(34.99, bag.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.99, bag.calculateMarkup(), 0.01);
    }

}
