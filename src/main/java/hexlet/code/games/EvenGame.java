package hexlet.code.games;


import hexlet.code.Engine;

public class EvenGame {
    public static void playEvenGame() {
        String[] questionsAndAnswers = new String[Engine.QUESTIONS_AND_ANSWERS_COUNT];
        final int cycleStep = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += cycleStep) {
            int question = Engine.makeNumber();
            questionsAndAnswers[i] = String.valueOf(question);
            questionsAndAnswers[i + 1] = (isEven(question) ? "yes" : "no");
        }

        Engine.playGame(questionsAndAnswers, "Answer 'yes' if number even otherwise answer 'no'.");
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
