package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void playEvenGame() {
        System.out.println("Welcome to the Brain Games!");
        Cli.askName();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int trueAnswersCount = 0;
        final int win = 3;
        while (trueAnswersCount < win) {
            int number = makeNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (isEven(number)) {
                if (answer.equals("yes")) {
                    System.out.println("\nCorrect!");
                    trueAnswersCount++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, "
                            + Cli.getName() + "!");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("\nCorrect!");
                    trueAnswersCount++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + Cli.getName()
                            + "!");
                    break;
                }
                scanner.close();
            }
        }
        if (trueAnswersCount == win) {
            System.out.println("Congratulations, "  + Cli.getName() + "!");
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int makeNumber() {
        final int ten = 10;
        int a = (int) (Math.random() * ten);
        int b = (int) (Math.random() * ten);
        return a * b;
    }

}
