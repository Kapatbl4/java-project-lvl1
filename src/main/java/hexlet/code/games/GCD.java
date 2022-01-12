package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        Engine.setInstruction("Find the greatest common divisor of given numbers.");

        Engine.setFirstQuestion(makeQuestion());
        Engine.setFirstCorrectAnswer(makeCorrectAnswer(Engine.getFirstQuestion()));

        Engine.setSecondQuestion(makeQuestion());
        Engine.setSecondCorrectAnswer(makeCorrectAnswer(Engine.getSecondQuestion()));

        Engine.setThirdQuestion(makeQuestion());
        Engine.setThirdCorrectAnswer(makeCorrectAnswer(Engine.getThirdQuestion()));

        Engine.playGame();
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
        int num1 = Engine.makeNumber();
        int num2 = Engine.makeNumber();
        if (num1 == 0) {
            num1 = 1;
        }
        if (num2 == 0) {
            num2 = 1;
        }
        return num1 + " " + num2;
    }
}
