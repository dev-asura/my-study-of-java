package OOP.Exercises.ExerciseCorporatePayrollSystem;

public class Employee {

    String name;
    double baseSalary;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    Employee(String name){
        this(name, 1412);
    }

    public double calculateSalary(){
        return baseSalary;
    }
}
