package OOP.Super;

public class Super {
    public static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Spongebob", "Squarepants");
        Student student = new Student("Harry", "Potter", 3.2);
        Employee employee = new Employee("Peter", "Parker", 92800);


        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();



    }
}
