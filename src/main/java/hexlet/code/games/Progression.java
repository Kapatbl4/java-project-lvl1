package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static String correctAnswer;

    public static void playProgression() {
        Engine.setInstruction("What number is missing in the progression?");

        Engine.setFirstQuestion(makeQuestion());
        Engine.setFirstCorrectAnswer(getCorrectAnswer());

        Engine.setSecondQuestion(makeQuestion());
        Engine.setSecondCorrectAnswer(getCorrectAnswer());

        Engine.setThirdQuestion(makeQuestion());
        Engine.setThirdCorrectAnswer(getCorrectAnswer());

        Engine.playGame();
    }

//    @Override
//    public String makeCorrectAnswer() {
//        return getCorrectAnswer();
//    }
//
//    @Override
    public static String makeQuestion() {
        int beginning = Engine.makeNumber();
        final int minLength = 5;
        final int maxLength = 15;
        final int midLength = 10;
        final int tenForRandom = 10;
        int sequenceLength = Engine.makeNumber();
        if (sequenceLength < minLength || sequenceLength > maxLength) {
            sequenceLength = midLength;
        }
        int[] numbers = new int[sequenceLength];
        int step = (int) (Math.random() * tenForRandom) + 1;
        numbers[0] = beginning;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        int hiddenNumberPosition = Math.abs(sequenceLength - (int) (Math.random() * tenForRandom));
        if (hiddenNumberPosition == numbers.length) {
            hiddenNumberPosition--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == hiddenNumberPosition) {
                sb.append(" ..");
                continue;
            }
            sb.append(" ").append(numbers[i]);
        }
        setCorrectAnswer(String.valueOf(numbers[hiddenNumberPosition]));
        return String.valueOf(sb);
    }
    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setCorrectAnswer(String correct) {
        Progression.correctAnswer = correct;
    }

}
