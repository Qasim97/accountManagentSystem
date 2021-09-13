package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{


    public static void main( String[] args ) {
        List<Savings> saving_accounts = new ArrayList<>();
        List<Checkings> checking_accounts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.print("\n1. Create a new account\n2. Log in\n3. Specify the interest rate for saving accounts\n4. All Accounts Details\n5. All Deduction Reports\n6. Exit");
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
                        boolean flag = true;
                        Savings acc = new Savings(acc_num, fname, address, phone_num, balance);
                        for(Savings account:saving_accounts){
                            if (account.getAccount_num().equals(acc_num)) {
                                flag = false;
                                break;
                            }
                        }
                        if(flag){
                            saving_accounts.add(acc);
                        }
                        else{
                            System.out.print("You can't create a saving account as you already owned an account\n");
                        }
                    }
                    else{
                        Checkings acc = new Checkings(acc_num, fname, address, phone_num, balance);
                        boolean flag = true;
                        for(Checkings account:checking_accounts){
                            if (account.getAccount_num().equals(acc_num)) {
                                flag = false;
                                break;
                            }
                        }
                        if(flag){
                            checking_accounts.add(acc);
                        }
                        else{
                            System.out.print("You can't create a saving account as you already owned an account\n");
                        }
                    }
                    break;
                case 2:
                    System.out.print("\t1. Saving\n\t2. Checkings\nEnter your choice: ");
                    userChoice = input.nextInt();
                    System.out.print("Enter Account Number: ");
                    String enteredNum = input.next();
                    if(userChoice==1){
                        for(Savings account:saving_accounts){
                            if(enteredNum.equals(account.getAccount_num())){
                                boolean logOut = false;
                                do{
                                    System.out.print("\n\t1. Deposit\n\t2. Withdrawal\n\t3. Check Balance\n\t" +
                                            "\t4. Transfer Amount\n\t5. Zakat Calculation\n\t6. Print Deduction Report\n\t7. Log out");
                                    System.out.print("\nEnter you choice: ");
                                    userChoice = input.nextInt();
                                    switch(userChoice){
                                        case 1:
                                            System.out.print("Enter amount you want to deposit: ");
                                            double amount = input.nextDouble();
                                            account.make_deposit(amount);
                                            account.print_statement();
//                                        System.out.print(account.getBalance());
                                            break;
                                        case 2:
                                            System.out.print("Enter the amount you want to withdraw: ");
                                            amount = input.nextDouble();
                                            account.make_withdrawal(amount);
                                            account.print_statement();
//                                        System.out.print(account.getBalance());
                                            break;
                                        case 3:
                                            System.out.print("Balance: " + account.getBalance());
                                            break;
                                        case 4:
                                            System.out.print("Enter the account number in which you want to transfer: ");
                                            String rec_acc_num = input.next();
                                            boolean acc_found = false;
                                            for(Checkings temp_account:checking_accounts){
                                                if(temp_account.account_num.equals(rec_acc_num)){
                                                    acc_found = true;
                                                    System.out.print("Enter the amount you want to transfer: ");
                                                    double temp_amount = input.nextDouble();
                                                    temp_account.make_deposit(temp_amount);
                                                }
                                            }
                                            for(Savings temp_account:saving_accounts){
                                                if(temp_account.account_num.equals(rec_acc_num)){
                                                    acc_found = true;
                                                    System.out.print("Enter the amount you want to transfer: ");
                                                    double temp_amount = input.nextDouble();
                                                    temp_account.make_deposit(temp_amount);
                                                }
                                            }
                                            if(!acc_found){
                                                System.out.print("Sorry, you have entered a wrong account number");
                                            }
                                            break;
                                        case 5:
                                            account.calculateZakat();
                                            System.out.print("Zakat Calculated: " + account.getZakat());
                                            break;
                                        case 6:
                                            break;
                                        case 7:
                                            logOut = true;
                                    }
                                }while(!logOut);

                            }
                        }
                    }
                    else{
                        for(Checkings account:checking_accounts){
                            if(enteredNum.equals(account.getAccount_num())){
                                boolean logOut = false;
                                do{
                                    System.out.print("\n\t1. Deposit\n\t2. Withdrawal\n\t3. Check Balance\n\t" +
                                            "\n\t4. Transfer Amount\n\t5. Print Deduction Report\n\t6. Log out");
                                    userChoice = input.nextInt();
                                    switch(userChoice){
                                        case 1:
                                            System.out.print("Enter amount you want to deposit: ");
                                            double amount = input.nextDouble();
                                            account.make_deposit(amount);
                                            account.print_statement();
//                                        System.out.print(account.getBalance());
                                            break;
                                        case 2:
                                            System.out.print("Enter the amount you want to withdraw: ");
                                            amount = input.nextDouble();
                                            account.make_withdrawal(amount);
                                            account.print_statement();
//                                        System.out.print(account.getBalance());
                                            break;
                                        case 3:
                                            System.out.print("Balance: " + account.getBalance());
                                            break;
                                        case 4:
                                            System.out.print("Enter the account number in which you want to transfer: ");
                                            String rec_acc_num = input.next();
                                            boolean acc_found = false;
                                            for(Checkings temp_account:checking_accounts){
                                                if(temp_account.account_num.equals(rec_acc_num)){
                                                    acc_found = true;
                                                    System.out.print("Enter the amount you want to transfer: ");
                                                    double temp_amount = input.nextDouble();
                                                    temp_account.make_deposit(temp_amount);
                                                }
                                                else{
                                                    for(Savings temp_account2:saving_accounts){
                                                        if(temp_account2.account_num.equals(rec_acc_num)){
                                                            acc_found = true;
                                                            System.out.print("Enter the amount you want to transfer: ");
                                                            double temp_amount = input.nextDouble();
                                                            temp_account2.make_deposit(temp_amount);
                                                        }
                                                    }
                                                }
                                            }
                                            if(!acc_found){
                                                System.out.print("Sorry, you have entered a wrong account number");
                                            }
                                            break;
                                        case 6:
                                            logOut = true;
                                    }
                                }while(!logOut);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the interest rate you want to specify: ");
                    double rate = input.nextDouble();
                    for(Savings account:saving_accounts){
                        account.specify_interestRate(rate);
                    }
                    break;
                case 4:
                    System.out.print("==========\nSaving Accounts\n==========");
                    for(Savings account:saving_accounts){
                        account.print_statement();
                    }
                    System.out.print("==========\nChecking Accounts\n==========");
                    for(Checkings account:checking_accounts){
                        account.print_statement();
                    }
                case 6:
                    exit = true;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }while(!exit);
    }
}
