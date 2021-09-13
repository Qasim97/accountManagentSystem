package org.example;

import java.io.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Create a new account\n2. Log in\n3. Specify the interest rate for saving accounts\n");
        System.out.print("Enter your choice: ");
        int userChoice = input.nextInt();
        switch(userChoice){
            case 1:
                System.out.print("Enter First Name: ");
                String fname = input.next();
                System.out.print("Enter Address: ");
                String address = input.next();
                System.out.print("Enter Phone Number: ");
                String phone_num = input.next();
                System.out.print("Enter Account Number: ");
                String acc_num = input.next();
                System.out.print("Enter Initial Balance: ");
                int balance = input.nextInt();
                System.out.print("\t1. Saving\n\t2. Checking\nChoose Account Type: ");
                int acc_type = input.nextInt();
                if(acc_type==1){
                    Savings acc = new Savings(acc_num, fname, address, phone_num, balance);
                    try {
                        FileWriter fileWriter = new FileWriter("saving_accounts.txt", true); //Set true for append mode
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.print(acc.getAccount_num() + "," + acc.getName() + "," + acc.getPhone_num() + "," + acc.getAddress() + "," + acc.date_created + "," + acc.getBalance() + "\n");  //New line
                        printWriter.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
                else{
                    Checkings acc = new Checkings();
                    try {
                        FileWriter fileWriter = new FileWriter("checking_accounts.txt", true); //Set true for append mode
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        printWriter.print(acc.getAccount_num() + "," + acc.getName() + "," + acc.getPhone_num() + "," + acc.getAddress() + "," + acc.date_created + "," + acc.getBalance() + "\n");  //New line
                        printWriter.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            break;
            case 2:
                System.out.print("Enter Account Number: ");
                String enteredAccNum = input.next();
                String data = "";
                try {
                    File myObj = new File("filename.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine() || data != enteredAccNum) {
                        data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }
    }
}
