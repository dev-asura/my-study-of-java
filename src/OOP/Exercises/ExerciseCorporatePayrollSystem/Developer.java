package OOP.Exercises.ExerciseCorporatePayrollSystem;

public class Developer extends Employee{

    String programmingLanguage;

    Developer(String name, double baseSalary, String programmingLanguage){
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() * 1.10;
    }
}
