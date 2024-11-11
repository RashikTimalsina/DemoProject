package com.rashiktimalsina.OOP_Project1;

public class VipCustomer {
    private String name;
    private int credit_limit;
    private String email_address;

    public VipCustomer(){
        this("User",1000000,"user@gmail.com");
    }

    public VipCustomer(String name, int credit_limit){
        this(name,credit_limit,"unknown@gmail.com");
    }

    public VipCustomer(String name, int credit_limit, String email_address) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }
}
