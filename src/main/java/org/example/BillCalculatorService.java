package org.example;

public class BillCalculatorService {
    public static double calculateNetPayableAmount(Bill bill) {
        double discount =0;

        if(!bill.isGrocery){
            if (bill.isEmployee) {
                discount = 0.3;
            } else if (bill.isAffiliate) {
                discount = 0.1;
            } else if (bill.isCustomerOver2years) {
                discount = 0.05;
            }

            discount+=Math.floor(bill.total/100)*0.05;
        }
        double netPayableAmount = bill.total - (bill.total)*discount;
        return netPayableAmount;
    }
}
