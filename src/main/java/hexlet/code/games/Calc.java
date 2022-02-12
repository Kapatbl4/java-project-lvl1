package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void playCalcGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            final int plus = 10;
            final int minus = 20;
            char sign;
            int s = Utils.makeNumber();
            if (s < plus) {
                sign = '+';
            } else if (s < minus) {
                sign = '-';
            } else {
                sign = '*';
            }

            int first = Utils.makeNumber();
            int second = Utils.makeNumber();

            questionsAndAnswers[i][0] = makeQuestion(first, second, sign);
            questionsAndAnswers[i][1] = makeCorrectAnswer(first, second, sign);
        }

        Engine.playGame(questionsAndAnswers, "What is the result of the expression?");
    }

    public static String makeCorrectAnswer(int first, int second, char sign) {
        int result;
        switch (sign) {
            case ('+') :
                result = first + second;
                break;
            case ('-') :
                result = first - second;
                break;
            default: result = first * second;
        }
        return String.valueOf(result);
    }

    public static String makeQuestion(int first, int second, char sign) {
        return first + " " + sign + " " + second;
    }
}
