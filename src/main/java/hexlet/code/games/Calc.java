package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playCalcGame() {
        Engine.setInstruction("What is the result of the expression?");

        Engine.setFirstQuestion(makeQuestion());
        Engine.setFirstCorrectAnswer(makeCorrectAnswer(Engine.getFirstQuestion()));

        Engine.setSecondQuestion(makeQuestion());
        Engine.setSecondCorrectAnswer(makeCorrectAnswer(Engine.getSecondQuestion()));

        Engine.setThirdQuestion(makeQuestion());
        Engine.setThirdCorrectAnswer(makeCorrectAnswer(Engine.getThirdQuestion()));

        Engine.playGame();
    }
//    @Override
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
//    @Override
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
