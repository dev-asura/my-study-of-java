package modulo02_POO;

public class Super {
    public static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        SuperPerson person = new SuperPerson("Spongebob", "Squarepants");
        SuperStudent student = new SuperStudent("Harry", "Potter", 3.2);
        SuperEmployee employee = new SuperEmployee("Peter", "Parker", 92800);


        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();



    }
}
