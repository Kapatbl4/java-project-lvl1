package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i][0] = makeQuestion();
            questionsAndAnswers[i][1] = makeCorrectAnswer(questionsAndAnswers[i][0]);
        }

        Engine.playGame(questionsAndAnswers, "Find the greatest common divisor of given numbers.");
    }
    public static String makeCorrectAnswer(String answer) {
        String[] numbers = answer.split(" ");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);
        while (number2 != 0) {
            int tmp = number1 % number2;
            number1 = number2;
            number2 = tmp;
        }
        return String.valueOf(number1);
    }
    public static String makeQuestion() {
        int num1 = Utils.makeNumber();
        int num2 = Utils.makeNumber();
        if (num1 == 0) {
            num1 = 1;
        }
        if (num2 == 0) {
            num2 = 1;
        }
        return num1 + " " + num2;
    }
}
