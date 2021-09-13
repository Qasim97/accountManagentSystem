package org.example;

public class Savings extends Account{
    private double zakat;

    public Savings(){
        super();
        zakat = 0;
    }

    public Savings(String a, String b, String c, String d, int e){
        super(a,b, c, d, e);
        zakat = 0;
    }

    public void calculateZakat(double a){
        zakat = getBalance() * 2.5 / 100;
    }

    public double getZakat(){
        return zakat;
    }
}
