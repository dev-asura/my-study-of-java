package module01_basics.exercises;
import java.util.Scanner;

public class javaQuizGame {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     // QUESTIONS array[]
        String[] questions = {"1. What is the main function of a router?",
                              "2. Which part of the computer is considered the brain?",
                              "3. What year was Facebook launched?",
                              "4. Who is known as the father of computer?",
                              "5. What was the first programming language?"};
     // OPTIONS array[][]
        String[][] options = {{"A) To process and store graphics data", "B) To connect different networks and route data packets", "C) To convert digital signals into physical sound", "D) To execute source code line by line"},
                              {"A) Hard Disk Drive (HDD)", "B) Graphics Processing Unit (GPU)", "C) Central Processing Unit (CPU)", "D) Random Access Memory (RAM)"},
                              {"A) 2002", "B) 2004", "C) 2006", "D) 2008"},
                              {"A) Alan Turing", "B) Charles Babbage", "C) Nikola Tesla", "D) Steve Jobs"},
                              {"A) Fortran", "B) Assembly", "C) High-Level Machine Code", "D) Plankalkül"}};

        String[] answers = {"B", "C", "B", "B", "A"};
        int score = 0;
        String guess;

        System.out.println("******************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME!");
        System.out.println("******************************");
        System.out.println();

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j]);
                }
            System.out.print("Enter your answer: ");
            guess = scanner.nextLine();
            if(guess.equalsIgnoreCase(answers[i])){
                System.out.println("*************");
                System.out.println("RIGHT ANSWER!");
                System.out.println("*************");
                System.out.println();
                score++;
            } else {
                System.out.println("*************");
                System.out.println("WRONG ANSWER!");
                System.out.println("*************");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("You score: " + score);

        scanner.close();
    }
}
