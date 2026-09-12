package modulo02_POO;

public class SuperStudent extends SuperPerson {

    double gpa;

    SuperStudent(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is: " + this.gpa + ".");
    }
}
