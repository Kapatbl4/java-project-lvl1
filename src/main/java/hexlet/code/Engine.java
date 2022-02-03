package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_AND_ANSWERS_COUNT = 6;

    public static void playGame(String[] questionsAndAnswers, String instruction) {
        String answer;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println();
        System.out.println("Hello, " + userName + "!");
        System.out.println(instruction);
        int aIndex = 1;
        final int step = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += step) {
            System.out.println("Question: " + questionsAndAnswers[i]);
            System.out.println("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            answer = scanner1.nextLine();
            if (answer.equals(questionsAndAnswers[aIndex])) {
                System.out.println("Correct!");
                aIndex += step;
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer;(. Correct answer was '"
                        + questionsAndAnswers[aIndex]
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

