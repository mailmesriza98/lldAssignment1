package org.example;
import  org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
public class BillController {

    @GetMapping("/calculate")
    public BillResponse calculateNetPayableAmount(@RequestBody Bill bill){
        double netPayableAmount = BillCalculatorService.calculateNetPayableAmount(bill);
        return new BillResponse(netPayableAmount);
    }
}
