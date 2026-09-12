package modulo02_POO;

public class SuperEmployee extends SuperPerson{

    int salary;

    SuperEmployee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(super.first + "'s salary is: " + this.salary);
    }
}
