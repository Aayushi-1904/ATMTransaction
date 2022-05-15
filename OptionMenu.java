package com.company;


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OptionMenu extends AccountActions {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();
    int pin, selection;


    List<Integer> valid_pin = new ArrayList<>();

    public static void main(String[] args) {
        OptionMenu ob = new OptionMenu();
        try {
            ob.getLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getLogin() throws IOException {


        try {
            valid_pin.add(1234);
            valid_pin.add(1342);
            valid_pin.add(5498);
            valid_pin.add(6471);


            System.out.println("Welcome ");
            System.out.println("Please enter your 4 digit PIN number:\n");
            pin = sc.nextInt();


        } catch (Exception e) {
            System.out.println("\nInvalid characters entered , Please enter a valid pin number\n");

        }


        while (!valid_pin.contains(pin)) {
            System.out.println("\nWrong pin ,Please enter a valid pin number\n");
            pin = sc.nextInt();
        }
        getAccountType();


    }

    public void getAccountType() {
        System.out.println("\nSelect the Account you want to access: ");
        System.out.println("1)Checking Account");
        System.out.println("2)Saving Account");
        System.out.println("3)Exit");
        System.out.print("Choice: ");

        selection = sc.nextInt();


        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("\nThank you for using this ATM\n");
                break;
            default:
                System.out.println("\nInvalid choice\n");
                getAccountType();
        }

    }

    public void getChecking() {
        System.out.println("\nChecking Account Details: ");
        System.out.println("1)View Balance");
        System.out.println("2)Withdraw Funds");
        System.out.println("3)Deposit Funds");
        System.out.println("4)Exit");
        System.out.print("Choice: ");


        selection = sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()) + "\n");
                getAccountType();
                break;
            case 2:
                checkingWithdraw();
                getAccountType();
                break;
            case 3:
                checkingDeposit();
                getAccountType();

                break;
            case 4:
                System.out.println("\nThank you for using this ATM");
                break;
            default:
                System.out.println("\nInvalid choice\n");
                getChecking();
        }


    }

    public void getSaving() {
        System.out.println("\nSaving Account :");
        System.out.println("1)View Balance");
        System.out.println("2)Withdraw Funds");
        System.out.println("3)Deposit Funds");
        System.out.println("4)Exit ");
        System.out.println("Choice:");

        selection = sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()) + "\n");
                getAccountType();
                break;
            case 2:
                savingWithdraw();
                getAccountType();
                break;
            case 3:
                savingDeposit();
                getAccountType();

                break;
            case 4:
                System.out.println("\nThank you for using this ATM");
                break;
            default:
                System.out.println("\nInvalid choice\n");
                getSaving();
        }


    }

}
