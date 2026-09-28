package OOP.Exercises.StudentGradingSystemWithEncapsulation;

public class Main {
    public static void main(String[] args){
        Student[] students = {
            new Student("Thiago Lucas", 3.6, 6.9),
            new Student("Vitoria Dias", 9.5, 8.4),
            new Student("Matteo Dias", 7.4, 8.1)
        };

        for(Student student : students){
            System.out.println(student.toString());
        }

        System.out.println();

        students[0].setGrade1(8.5);
    }
}
