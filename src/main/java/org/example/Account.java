package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Account {
    protected String account_num, name, address, phone_num;
    protected double balance;
    LocalDate date_created, transaction_date;
    LocalTime transaction_time;
    double last_transaction;

    public Account(String a, String b, String c, String d, double e){
        account_num = a;
        name = b;
        address = c;
        phone_num = d;
        balance = e;
        date_created = LocalDate.now();
    }

    public void setAccount_num(String a){
        this.account_num = a;
    }

    public void setName(String a){
        this.name = a;
    }

    public void setAddress(String a){
        this.address = a;
    }

    public void setPhone_num(String a){
        this.phone_num = a;
    }

    public void setBalance(int a){
        this.balance = a;
    }

    public String getAccount_num(){
        return account_num;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone_num(){
        return phone_num;
    }

    public double getBalance(){
        return balance;
    }

    public void make_deposit(double a){
        balance += a;
        transaction_date = LocalDate.now();
        transaction_time = LocalTime.now();
        last_transaction = a;
    }

    public void make_withdrawal(double a){
        transaction_date = LocalDate.now();
        transaction_time = LocalTime.now();
        last_transaction = a;
    }

    public void print_statement(){
        System.out.print("Customer Name: " + name + "\nAccount Number: " + account_num + "\nTime of Transaction: " + transaction_time +
                "\nDate of Transaction: " + transaction_date +
                "\nTransaction Amount: " + last_transaction + "\nRemaining Balance: " + getBalance());
    }
}
