package modulo02_POO.ExerciseStudentGradeChecker;

public class StudentGradeChecker {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Thiago", "Enrolled", 3.3, 6.9),
                new Student("Vitoria", "Enrolled", 9.3, 7.3),
                new Student("Matteo", "Enrolled", 7, 9.8)
        };

        for(Student student : students) {
            student.calculateAverage();
            student.checkStatus();
            student.displayStudentInfo();
        }
    }
}
