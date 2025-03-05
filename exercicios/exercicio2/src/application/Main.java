package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice;
        double dollarBought;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        dollarBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, dollarBought));

    }
}