package OOP.Exercises.StudentGradingSystemWithEncapsulation;

public class Student {
    private String name;
    private Double grade1;
    private Double grade2;

    Student(String name, double grade1, double grade2){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade1(Double grade1){
        if(grade1 < 0 || grade1 > 10){
            System.out.println("Invalid grade.");
        }else{
           this.grade1 = grade1;
        }
    }

    public void setGrade2(Double grade2){
        if(grade2 < 0 || grade2 > 10){
            System.out.println("Invalid grade.");
        }else{
            this.grade2 = grade2;
        }
    }

    public String getName(){
        return this.name;
    }

    public double getGrade1(){
        return this.grade1;
    }

    public double getGrade2(){
        return this.grade2;
    }

    public double calculateAverage(){
        return (getGrade1() + getGrade2())/2;
    }

    public String getStatus(){
        if(calculateAverage() >= 7.0){
            return "Approved";
        } else {
            return "Reproved";
        }
    }

    @Override
    public String toString(){
        return "Student: " + getName() + " | Average: " + calculateAverage() + " | Status: " + getStatus();
    }
}
