package hexlet.code;

import java.util.Scanner;

public class Engine {
    public String question;
    public String correctAnswer;
    public final String greeting = "Welcome to the Brain Games!";
    public String answer;
    public void playGame() {
        System.out.println(greeting);
        Cli.askName();
        int trueAnswersCount = 0;
        final int win = 3;
        while (trueAnswersCount < win) {
            question = makeQuestion();
            System.out.println("Question: " + question);
            correctAnswer = makeCorrectAnswer();
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            this.answer = scanner.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("\nCorrect!");
                trueAnswersCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer + "'.\n"
                            + "Let's try again, "
                            + Cli.getName() + "!");
                    break;
                }
            }
        if (trueAnswersCount == win) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
    public String makeCorrectAnswer() {
        return "";
    }

    public String makeQuestion() {
        return "";
    }

    public int makeNumber() {
        final int ten = 10;
        int a = (int) (Math.random() * ten);
        int b = (int) (Math.random() * ten);
        return a * b;
    }
}
