import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(100, 85);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(10, 5);
        assertEquals(50, printer.getPaper());
        assertEquals(35, printer.getToner());
    }

    @Test
    public void notEnoughPaper(){
        printer.print(15, 10);
        assertEquals(100, printer.getPaper());
    }

}
