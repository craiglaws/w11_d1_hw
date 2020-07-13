import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle strathmore = new WaterBottle();

    @Test
    public void isFullAtStart(){
        assertEquals(100, strathmore.getVolume());
    }

    @Test
    public void takeADrink(){
        strathmore.drink();
        strathmore.drink();
        assertEquals(80, strathmore.getVolume());
    }

    @Test
    public void emptyBottle(){
        strathmore.empty();
        assertEquals(0, strathmore.getVolume());
    }

    @Test
    public void refillBottle(){
        strathmore.refill();
        assertEquals(100, strathmore.getVolume());
    }
}


