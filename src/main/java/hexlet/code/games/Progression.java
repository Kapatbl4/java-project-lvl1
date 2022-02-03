package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static String correctAnswer;

    public static void playProgression() {
        String[] questionsAndAnswers = new String[Engine.QUESTIONS_AND_ANSWERS_COUNT];
        final int cycleStep = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += cycleStep) {
            questionsAndAnswers[i] = makeQuestion();
            questionsAndAnswers[i + 1] = getCorrectAnswer();
        }

        Engine.playGame(questionsAndAnswers, "What number is missing in the progression?");
    }


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
