package org.example;

public class Checkings extends Account{
    public Checkings(){
        super();
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
