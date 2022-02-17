package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int MIN_LENGTH = 5;
    static final int MAX_LENGTH = 15;
    static final int MAX_STEP = 10;
    public static void playProgression() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int beginning = Utils.makeNumber();
            int sequenceLength = Utils.makeNumber(MIN_LENGTH, MAX_LENGTH);
            int step = Utils.makeNumber(1, MAX_STEP);

            int[] numbers = makeProgression(beginning, sequenceLength, step);

            int hiddenNumberPosition = Utils.makeNumber(0, numbers.length - 1);

            questionsAndAnswers[i][0] = makeQuestion(numbers, hiddenNumberPosition);
            questionsAndAnswers[i][1] = String.valueOf(numbers[hiddenNumberPosition]);
        }

        Engine.playGame(questionsAndAnswers, "What number is missing in the progression?");
    }

    public static int[] makeProgression(int beginning, int progressionLength, int step) {
        int[] numbers = new int[progressionLength];
        numbers[0] = beginning;
        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + step;
        }
        return numbers;
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

}
