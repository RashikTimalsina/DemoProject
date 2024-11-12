package com.rashiktimalsina.OOP_Project1;

public class VIPCustomerMain {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("The default customer name is " + vipCustomer.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Hari",10000);
        System.out.println("The second VIPcustomer name is " +vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Raju", 150000, "raju@gmail.com");
        System.out.println("The third VIPcustomer name is " +vipCustomer3.getName());

    }
}
