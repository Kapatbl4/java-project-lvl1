package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playCalcGame() {
        String[] questionsAndAnswers = new String[Engine.QUESTIONS_AND_ANSWERS_COUNT];
        final int cycleStep = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += cycleStep) {
            questionsAndAnswers[i] = makeQuestion();
            questionsAndAnswers[i + 1] = makeCorrectAnswer(questionsAndAnswers[i]);
        }

        Engine.playGame(questionsAndAnswers, "What is the result of the expression?");
    }

    public static String makeCorrectAnswer(String answer) {
        String[] strings = answer.split(" ");
        int result;
        int first = Integer.parseInt(strings[0]);
        int second = Integer.parseInt(strings[2]);
        switch (strings[1]) {
            case ("+") :
                result = first + second;
                break;
            case ("-") :
                result = first - second;
                break;
            default: result = first * second;
        }
        return String.valueOf(result);
    }

    public static String makeQuestion() {
        final int plus = 10;
        final int minus = 20;
        char sign;
        int i = Engine.makeNumber();
        if (i < plus) {
            sign = '+';
        } else if (i < minus) {
            sign = '-';
        } else {
            sign = '*';
        }

        int first = Engine.makeNumber();
        int second = Engine.makeNumber();

        return first + " " + sign + " " + second;
    }
}
