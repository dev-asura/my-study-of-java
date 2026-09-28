package OOP.Exercises.ExerciseCorporatePayrollSystem;

public class Manager extends Employee{

    double bonus;

    Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
