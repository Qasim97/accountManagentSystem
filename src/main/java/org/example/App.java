package org.example;

import java.time.LocalDate;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter writer_saving = new FileWriter("saving_accounts.txt");;
        FileWriter write_checkings;
        System.out.print("1. Create a new account\n2. Log in\n3. Specify the interest rate for saving accounts\n");
        System.out.print("Enter your choice: ");
        int userChoice = input.nextInt();
        switch(userChoice){
            case 1:
                System.out.print("Enter Name: ");
                String name = input.next();
                System.out.print("Enter Address: ");
                String address = input.next();
                System.out.print("Enter Phone Number: ");
                String phone_num = input.next();
                System.out.print("Enter Account Number: ");
                String acc_num = input.next();
                System.out.print("Enter Initial Balance: ");
                int balance = input.nextInt();
                System.out.print("t1. Saving\n\t2. Checking\nChoose Account Type: ");
                int acc_type = input.nextInt();
                if(acc_type==1){
                    Savings acc = new Savings(acc_num, name, address, phone_num, balance);

                }
                else{
                    Checkings acc = new Checkings();
                }

        }
    }
}
