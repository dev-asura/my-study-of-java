package OOP.Exercises.ExerciseStudentGradeChecker;

public class Student {
    String name;
    String enrollment;
    double grade01;
    double grade02;
    double average;
    String status;

    Student(String name, String enrollment, double grade01, double grade02){
        this.name = name;
        this.enrollment = enrollment;
        this.grade01 = grade01;
        this.grade02 = grade02;
    }

    public void calculateAverage(){
        this.average = (grade01 + grade02)/2;
    }

    public void checkStatus(){
        if(this.average >= 7){
            this.status = "Approved";
        } else {
            this.status = "Disapproved";
        }
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + this.name + " | Average: " + this.average + " | Status: " + this.status);
    }
}
