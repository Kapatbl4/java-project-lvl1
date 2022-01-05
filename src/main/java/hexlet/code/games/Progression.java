package hexlet.code.games;

import hexlet.code.Engine;

public class Progression extends Engine {
    public void playProgression() {
        setInstruction("What number is missing in the progression?");
        playGame();
    }

    @Override
    public String makeCorrectAnswer() {
        return getCorrectAnswer();
    }

    @Override
    public String makeQuestion() {
        int beginning = makeNumber();
        int sequenceLength = makeNumber();
        if (sequenceLength < 5 || sequenceLength > 15) sequenceLength = 10;
        int[] numbers = new int[sequenceLength];
        int step = (int) (Math.random() * 10) + 1;
        numbers[0] = beginning;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        int hiddenNumberPosition = Math.abs(sequenceLength - (int) (Math.random() * 10));
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
}
