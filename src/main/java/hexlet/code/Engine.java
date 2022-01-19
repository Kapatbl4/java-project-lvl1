package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String instruction;
    private static String answer;
    public static final int QUESTIONS_AND_ANSWERS_COUNT = 6;

    public static int makeNumber() {
        final int tenForRandom = 10;
        int a = (int) (Math.random() * tenForRandom);
        int b = (int) (Math.random() * tenForRandom);
        return a * b;
    }

    public static void setAnswer(String a) {
        Engine.answer = a;
    }

    public static String getAnswer() {
        return answer;
    }

    public static void setInstruction(String input) {
        instruction = input;
    }

    public static String getInstruction() {
        return instruction;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void playGame(String[] questionsAndAnswers) {
        greeting();
        Cli.askName();
        System.out.println(getInstruction());
        int trueAnswersCount = 0;
        final int win = 3;
        int aIndex = 1;
        final int step = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += step) {
            System.out.println("Question: " + questionsAndAnswers[i]);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            setAnswer(scanner.nextLine());
            if (getAnswer().equals(questionsAndAnswers[aIndex])) {
                System.out.println("Correct!");
                aIndex += step;
                trueAnswersCount++;
            } else {
                System.out.println("'"
                        + getAnswer()
                        + "' is wrong answer;(. Correct answer was '"
                        + questionsAndAnswers[aIndex]
                        + "'.\n"
                        + "Let's try again, "
                        + Cli.getName()
                        + "!");
                break;
            }
        }
        if (trueAnswersCount == win) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

