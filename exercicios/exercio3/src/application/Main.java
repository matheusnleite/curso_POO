package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        double value;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);



        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
             value = sc.nextDouble();
            account = new Account(number, name, value);
            System.out.println("\nAccount data:");
            System.out.println(account);

        } else {
            account = new Account(number, name);
            System.out.println("\nAccount data:");
            System.out.println(account);
        }

        System.out.print("\nEnter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}