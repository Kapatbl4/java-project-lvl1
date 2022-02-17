package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int num1 = Utils.makeNumber();
            int num2 = Utils.makeNumber();

            questionsAndAnswers[i][0] = num1 + " " + num2;
            questionsAndAnswers[i][1] = findGcd(num1, num2);
        }

        Engine.playGame(questionsAndAnswers, "Find the greatest common divisor of given numbers.");
    }
    public static String findGcd(int number1, int number2) {
        while (number2 != 0) {
            int tmp = number1 % number2;
            number1 = number2;
            number2 = tmp;
        }
        return String.valueOf(number1);
    }
}
