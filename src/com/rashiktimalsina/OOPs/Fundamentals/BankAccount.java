package com.rashiktimalsina.OOP_Project1;

public class BankAccount {
    public String getCustomer_name() {
        return customer_name;
    }
    private String account_number;
    private double balance;
    private String customer_name;
    private String customer_email;
    private String customer_phone;

    private  double amount;

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email= customer_email;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public void  setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }



    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
        System.out.println("Your new balance is :" + balance);
    }

    public void withdraw(double amount) {
        if(balance<amount){
            System.out.println("Insufficient balance");
        }
        else{
            this.amount += amount;

        }
        this.balance = balance - amount;
        System.out.println("Your new balance is :" + balance);
    }

}
