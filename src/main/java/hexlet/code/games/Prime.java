package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    public static void playPrime() {
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int result = Utils.makeNumber();
            questionsAndAnswers[i][0] = String.valueOf(result);
            questionsAndAnswers[i][1] = isPrime(result) ? "yes" : "no";
        }

        Engine.playGame(questionsAndAnswers, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static boolean isPrime(int q) {
        final int firstNotPrimeNumber = 4;
        if (q == 0 || q == 1) {
            return false;
        }
        if (q < firstNotPrimeNumber) {
            return true;
        }
        if (q % (int) (Math.sqrt(q)) == 0) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(q); i++) {
            if (q % i == 0) {
                return false;
            }
        }
        return true;
    }

}
