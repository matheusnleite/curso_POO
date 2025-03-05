package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student student = new Student();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();
        System.out.println(student.result());
    }
}
