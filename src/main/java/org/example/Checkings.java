package org.example;

public class Checkings extends Account{
    double checking_tax;

    public Checkings(String a, String b, String c, String d, double e){
        super(a, b, c, d, e);
        checking_tax = 0;
    }

    public void make_withdrawal(double a){
        if(a>5000){
            System.out.print("You can't withdraw more than 5000.");
        }
        else{
            balance -= a;
        }
        
    }
}
