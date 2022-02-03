package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static void playEvenGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int question = Utils.makeNumber();
            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = (isEven(question) ? "yes" : "no");
        }

        Engine.playGame(questionsAndAnswers, "Answer 'yes' if number even otherwise answer 'no'.");
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
