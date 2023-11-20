import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz Game!");

        int score = 0;
        int totalQuestions = 3; // Adjust the number of questions as needed

        // Question 1
        // Question 1
System.out.println("\nQuestion 1: Who invented Java Programming?");
System.out.println("a) Guido van Rossum\nb) James Gosling\nc) Dennis Ritchie\nd) Bjarne Stroustrup");
String answer1 = scanner.nextLine().trim().toLowerCase();

if (answer1.equals("b")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Incorrect. The correct answer is b)");
}

// Question 2
System.out.println("\nQuestion 2: Which statement is true about Java?");
System.out.println("a) Java is a sequence-dependent programming language\nb) Java is a code dependent programming language\nc) Java is a platform-dependent programming language\nd) Java is a platform independent programming language");
String answer2 = scanner.nextLine().trim().toLowerCase();

if (answer2.equals("d")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Incorrect. The correct answer is d)");
}


        // Question 3
        System.out.println("\nQuestion 3: How many continents are there?");
        System.out.println("a) 5\nb) 6\nc) 7\nd) 8");
        String answer3 = scanner.nextLine().trim().toLowerCase();

        if (answer3.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) 7");
        }

        // Display final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + totalQuestions);

        scanner.close();
    }
}