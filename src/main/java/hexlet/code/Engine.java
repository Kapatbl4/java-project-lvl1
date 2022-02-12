package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void playGame(String[][] questionsAndAnswers, String instruction) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("\nHello, " + userName + "!");
        System.out.println(instruction);

        for (String[] questionsAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questionsAndAnswer[0]);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(questionsAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer;(. Correct answer was '"
                        + questionsAndAnswer[1]
                        + "'.\n"
                        + "Let's try again, "
                        + userName
                        + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

