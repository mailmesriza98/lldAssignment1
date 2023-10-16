package org.example;

public class BillResponse {
    private double netPayableAmount;

    public BillResponse(double netPayableAmount) {
        this.netPayableAmount = netPayableAmount;
    }

    public double getNetPayableAmount() {
        return netPayableAmount;
    }

    public void setNetPayableAmount(double netPayableAmount) {
        this.netPayableAmount = netPayableAmount;
    }
}
