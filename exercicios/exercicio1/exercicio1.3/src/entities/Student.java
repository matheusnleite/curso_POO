package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double finalGrade() {
        return n1 + n2 + n3;
    }

    public String result(){
        System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade()));
        if(finalGrade()>=60){
            return "PASS";
        }
        else{
            return "FAILED\nMISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS";
        }
    }
}
