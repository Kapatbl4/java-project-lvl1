package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        Engine.setInstruction("Find the greatest common divisor of given numbers.");
        String[] questionsAndAnswers = new String[Engine.QUESTIONS_AND_ANSWERS_COUNT];
        final int cycleStep = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += cycleStep) {
            questionsAndAnswers[i] = makeQuestion();
            questionsAndAnswers[i + 1] = makeCorrectAnswer(questionsAndAnswers[i]);
        }

        Engine.playGame(questionsAndAnswers);
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
