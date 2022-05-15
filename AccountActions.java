package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountActions {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs '###,##0.00");

    private double checkingBalance= 0.0;
    private double savingBalance=0.0;


    public double getCheckingBalance() {
        return checkingBalance;

    }

    public double getSavingBalance() {
        return savingBalance;

    }


    public void checkingWithdraw() {

        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("\nEnter the amount you want to withdraw from Checking Account:");
        double amount = sc.nextDouble();
        if ((checkingBalance - amount) >= 0) {
            checkingBalance -= amount;
            System.out.println("Updated Checking Account Balance:" + moneyFormat.format(checkingBalance));

        } else {
            System.out.println("\nInsufficient Balance to withdraw amount!\n");

        }
    }


    public void savingWithdraw() {

        System.out.println("\nSaving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you want to withdraw from Checking Account:");
        double amount = sc.nextDouble();
        if ((savingBalance - amount) >= 0) {
            savingBalance -= amount;
            System.out.println("Updated Saving Account Balance:" + moneyFormat.format(savingBalance));

        } else {
            System.out.println("Insufficient Balance to withdraw amount!\n");

        }
    }


    public void checkingDeposit() {

        System.out.println("\nChecking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Enter the amount you want to deposit to Checking Account:");
        double amount = sc.nextDouble();
        if ((checkingBalance + amount) >= 0) {
            checkingBalance += amount;
            System.out.println("Updated Checking Account Balance:" + moneyFormat.format(checkingBalance));

        } else {
            System.out.println("Amount cannot be negative\n");

        }
    }


    public void savingDeposit() {

        System.out.println("\nChecking Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Enter the amount you want to deposit to Saving Account:");
        double amount = sc.nextDouble();
        if ((savingBalance + amount) >= 0) {
            savingBalance += amount;
            System.out.println("Updated Saving  Account Balance:" + moneyFormat.format(savingBalance));

        } else {
            System.out.println("Amount cannot be negative\n");

        }
    }


}

