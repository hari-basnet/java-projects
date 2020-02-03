package com.java;

public class VipCustomer {

    private String vipCustomerName;
    private double creditLimit;
    private String vipCustomerEmail;

    public VipCustomer() {
        this("Default name", 5000.00, "default@email.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String vipCustomerName, String vipCustomerEmail) {
        this(vipCustomerName, 2000.00, vipCustomerEmail);
    }

    public VipCustomer(String vipCustomerName, double creditLimit, String vipCustomerEmail) {
        this.vipCustomerName = vipCustomerName;
        this.creditLimit = creditLimit;
        this.vipCustomerEmail = vipCustomerEmail;
    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public void setVipCustomerName(String vipCustomerName) {
        this.vipCustomerName = vipCustomerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getVipCustomerEmail() {
        return vipCustomerEmail;
    }

    public void setVipCustomerEmail(String vipCustomerEmail) {
        this.vipCustomerEmail = vipCustomerEmail;
    }
}
