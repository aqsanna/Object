package com.company;

public class BankAccount {
    private String account;
    private int balance;
    public static int count=0;
    BankAccount(){
        count++;
    }

    public BankAccount setAccount(String account){
        this.account=account;
        return this;
    }
    public String getAccount(){
        return this.account;
    }
    public BankAccount setBalance (int balance){
        this.balance=balance;
        System.out.println("original account balance : " + balance);
        return this;
    }
    public int getBalance(){
        return this.balance;
    }

    public int addBalance(int amount){
        balance +=amount;
        System.out.println("after add balance : " );
        return balance;
    }
    public int withdrawalBalance(int amount){
        balance -=amount;
        System.out.println("final account balance : " + balance);
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.setAccount("2470015714010010");
        bankAccount.setBalance(1000000);
        System.out.println(bankAccount.addBalance(50000));
        System.out.println(bankAccount.withdrawalBalance(14000));
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(count);


    }
}
