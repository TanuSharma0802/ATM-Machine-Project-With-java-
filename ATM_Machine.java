package ATM_Machine;

import java.util.Scanner;
import java.util.*;

public class ATM_Machine {
    public static void main(String[] args) {
        ATM obj = new ATM();

        obj.createPin();
    }

}

class ATM {
    float balance = 1000;
    int PIN;

    public void createPin() {
        System.out.println("Create Your PIN:-");
        Scanner scn = new Scanner(System.in);
        PIN = scn.nextInt();
        System.out.println("ReEnter Your PIN:-");
        // Scanner scn=new Scanner(System.in);
        int CPIN = scn.nextInt();
        if (PIN == CPIN) {
            System.out.println("YOUR PIN GENERATED SUCCESSFULLY.");
            checkPin();
        } else {
            System.out.println("PLEASE ENTER A CORRECT PIN.");

        }

    }

    public void checkPin() {
        System.out.println("ENTER YOUR PIN:-");
        Scanner scn1 = new Scanner(System.in);
        int Pin1 = scn1.nextInt();
        if (PIN == Pin1) {
            menu();
        } else {
            System.out.println("ENTER VALID PIN:");
            menu();
        }
    }

    public void menu() {

        System.out.println("ENTER YOUR CHOICE:-");
        System.out.println("1. CHECK YOUR A/C BALANCE");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. DEPOSIT MONEY");
        System.out.println("4. PIN GENERATION");
        System.out.println("5. EXIT");

        Scanner scn2 = new Scanner(System.in);
        int opt = scn2.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            createPin();
        } else if (opt == 5) {
            return;
        } else {
            System.out.println("PLEASE ENTER A VALID CHOICE:-");

        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw:");
        Scanner scn1 = new Scanner(System.in);
        float amount = scn1.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdrawl Successful.");
            menu();

        }
    }

    public void depositMoney() {
        System.out.println("Enter the Amount:");
        Scanner scn2 = new Scanner(System.in);
        float amount1 = scn2.nextFloat();
        balance = balance + amount1;
        System.out.println("Money Deposited Successfully.");
        menu();
    }
}