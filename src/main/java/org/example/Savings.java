package org.example;

public class Savings extends Account{
    private double zakat, interest_rate;

    public Savings(String a, String b, String c, String d, double e){
        super(a,b, c, d, e);
        zakat = 0;
        interest_rate = 0;
    }


    public void calculateZakat(){
        zakat = getBalance() * 2.5 / 100;
    }

    public double getZakat(){
        return zakat;
    }

    public void make_withdrawal(double a){
        if(a>balance){
            System.out.print("You can't withdrawal the specified amount");
        }
        else{
            balance -= a;
        }
    }

    public  void specify_interestRate(double a){
        interest_rate = a;
    }
}
