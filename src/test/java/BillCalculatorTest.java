import org.example.Bill;
import org.example.BillCalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BillCalculatorTest {

    @Test
    public void netPayableAmountTest(){
        Bill bill=new Bill(true,false,false,false,1000);
        double netPayable = BillCalculatorService.calculateNetPayableAmount(bill);
        assertEquals(netPayable,200);
    }

    @Test
    public void netPayableAmountTest2(){
        Bill bill=new Bill(false,false,false,true,1009);
        double netPayable = BillCalculatorService.calculateNetPayableAmount(bill);
        assertEquals(netPayable,454.04999999999995);
    }
}
