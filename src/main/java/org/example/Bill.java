package org.example;

public class Bill {

    public boolean isEmployee;
    public boolean isAffiliate;

    public boolean isGrocery;

    public boolean isCustomerOver2years;

    public double total;

    public Bill() {
        // Default constructor required for deserialization
    }

    public Bill(boolean isEmployee, boolean isAffiliate, boolean isGrocery, boolean isCustomerOver2years, double total) {
        this.isEmployee = isEmployee;
        this.isAffiliate = isAffiliate;
        this.isGrocery = isGrocery;
        this.isCustomerOver2years = isCustomerOver2years;
        this.total = total;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }
}
