package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee);
        System.out.print("\nWhich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println();
        System.out.println("Updated data: " + employee);
    }
}
