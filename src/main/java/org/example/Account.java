package org.example;

import java.time.LocalDate;

public class Account {
    protected String account_num, name, address, phone_num;
    protected double balance;
    LocalDate date_created;

    public Account(){
        account_num = "";
        name = "";
        address = "";
        phone_num = "";
        balance = 0;
    }

    public Account(String a, String b, String c, String d, int e){
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
    }

    public void make_withdrawal(double a){
        System.out.print("Please Wait");
    }
}
