package OOP.Exercises.ExerciseCorporatePayrollSystem;

public class Main {
    public static void main(String[] args){

    Employee[] employees = {
            new Employee("John Rogan", 1500),
            new Employee("Maria Bonita"),
            new Developer("Thiago Lucas", 5500, "Java"),
            new Manager("SpongeBob", 11500, 2000)
    };

    for(Employee employee : employees){
        System.out.printf("Name: %s | Salary: %.2f", employee.name, employee.calculateSalary());
        System.out.println();
    }
    }
}
