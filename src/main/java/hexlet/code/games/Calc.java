package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final String[] SIGNS = new String[]{"+", "-", "*"};
    public static void playCalcGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            String sign = SIGNS[Utils.makeNumber(SIGNS.length - 1)];
            int first = Utils.makeNumber();
            int second = Utils.makeNumber();

            questionsAndAnswers[i][0] = first + " " + sign + " " + second;
            questionsAndAnswers[i][1] = calculate(first, second, sign);
        }

        Engine.playGame(questionsAndAnswers, "What is the result of the expression?");
    }

    public static String calculate(int first, int second, String sign) {
        int result;
        switch (sign) {
            case ("+") :
                result = first + second;
                break;
            case ("-") :
                result = first - second;
                break;
            case ("*") :
                result = first * second;
                break;
            default: throw  new RuntimeException("Unsupported operation");
        }
        return String.valueOf(result);
    }
}
