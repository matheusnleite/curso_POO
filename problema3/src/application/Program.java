package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.println("Circumference: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("PI value: " + String.format("%.2f", calc.PI));


        sc.close();
    }


}
