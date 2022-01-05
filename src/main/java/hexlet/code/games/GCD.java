package hexlet.code.games;

import hexlet.code.Engine;

public class GCD extends Engine {
    public void gcdGame() {
        setInstruction("Find the greatest common divisor of given numbers.");
        playGame();
    }

    @Override
    public String makeCorrectAnswer() {
        String[] numbers = getQuestion().split(" ");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);
        while (number2 != 0) {
            int tmp = number1 % number2;
            number1 = number2;
            number2 = tmp;
        }
        return String.valueOf(number1);
    }

    @Override
    public String makeQuestion() {
        int num1 = makeNumber();
        int num2 = makeNumber();
        if (num1 == 0) num1 = 1;
        if (num2 == 0) num2 = 1;
        return num1 + " " + num2;
    }
}
