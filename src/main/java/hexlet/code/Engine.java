package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_AND_ANSWERS_COUNT = 6;

    public static int makeNumber() {
        final int tenForRandom = 10;
        int a = (int) (Math.random() * tenForRandom);
        int b = (int) (Math.random() * tenForRandom);
        return a * b;
    }

    public static void playGame(String[] questionsAndAnswers, String instruction) {
        String answer;
        Cli.sayHello();
        System.out.println(instruction);
        int aIndex = 1;
        final int step = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += step) {
            System.out.println("Question: " + questionsAndAnswers[i]);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
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
                        + Cli.getName()
                        + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}

