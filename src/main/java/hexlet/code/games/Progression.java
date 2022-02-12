package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void playProgression() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int beginning = Utils.makeNumber();
            final int minLength = 5;
            final int maxLength = 15;
            final int midLength = 10;
            int sequenceLength = Utils.makeNumber();
            if (sequenceLength < minLength || sequenceLength > maxLength) {
                sequenceLength = midLength;
            }
            int[] numbers = new int[sequenceLength];
            int step = Utils.makeFromOneToTen() + 1;
            numbers[0] = beginning;
            for (int j = 1; j < numbers.length; j++) {
                numbers[j] = numbers[j - 1] + step;
            }

            int hiddenNumberPosition = Math.abs(numbers.length - Utils.makeFromOneToTen());
            if (hiddenNumberPosition == numbers.length) {
                hiddenNumberPosition--;
            }

            questionsAndAnswers[i][0] = makeQuestion(numbers, hiddenNumberPosition);
            questionsAndAnswers[i][1] = makeCorrectAnswer(numbers, hiddenNumberPosition);
        }

        Engine.playGame(questionsAndAnswers, "What number is missing in the progression?");
    }


    public static String makeQuestion(int[] numbers, int hiddenNumberPosition) {
        StringBuilder sb = new StringBuilder();
        if (hiddenNumberPosition == 0) {
            sb.append("..");
        } else {
            sb.append(numbers[0]);
        }
        for (int i = 1; i < numbers.length; i++) {
            if (i == hiddenNumberPosition) {
                sb.append(" ..");
                continue;
            }
            sb.append(" ").append(numbers[i]);
        }
        return String.valueOf(sb);
    }

    public static String makeCorrectAnswer(int[] numbers, int hiddenNumberPosition) {
        return String.valueOf(numbers[hiddenNumberPosition]);
    }
}
