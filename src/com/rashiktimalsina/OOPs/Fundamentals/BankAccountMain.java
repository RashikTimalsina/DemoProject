package com.rashiktimalsina.OOP_Project1;

public class BankAccountMain {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccount_number("2700001232");
        bankAccount.setBalance(5000.0);
        bankAccount.setAmount(1000.0);
//        bankAccount.setCustomer_name("Ram");
//        bankAccount.setCustomer_email("ram@gmail.com");
//        bankAccount.setCustomer_phone("9842321332");
//
//        System.out.println(bankAccount.getAccount_number());
        System.out.println("Your balance is : "+bankAccount.getBalance());
        System.out.println("Your amount deposited is : "+bankAccount.getAmount());
//        System.out.println(bankAccount.getCustomer_name());
//        System.out.println(bankAccount.getCustomer_email());
//        System.out.println(bankAccount.getCustomer_phone());


        bankAccount.deposit(1000.0);                //initially balance was 5000 and amount deposited 1000 makes total 6000

        bankAccount.withdraw(500.0);                //now balance is 6000 and after withdrawing 500 it makes total 5500
        System.out.println("After withdrawal of withdrawal amount \nYour new balance is " +bankAccount.getBalance());

    }
}