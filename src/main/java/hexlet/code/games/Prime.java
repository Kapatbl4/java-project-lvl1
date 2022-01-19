package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    private static int question;
    public static void playPrime() {
        Engine.setInstruction("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questionsAndAnswers = new String[Engine.QUESTIONS_AND_ANSWERS_COUNT];
        final int cycleStep = 2;
        for (int i = 0; i < questionsAndAnswers.length; i += cycleStep) {
            questionsAndAnswers[i] = makeQuestion();
            questionsAndAnswers[i + 1] = makeCorrectAnswer();
        }

        Engine.playGame(questionsAndAnswers);
    }

    public static String makeCorrectAnswer() {
        int q = getQuestion();
        final int firstNotPrimeNumber = 4;
        if (q == 0) {
            return "no";
        }
        if (q < firstNotPrimeNumber) {
            return "yes";
        }
        if (q % (int) (Math.sqrt(q)) == 0) {
            return "no";
        }
        for (int i = 2; i < Math.sqrt(q); i++) {
            if (q % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String makeQuestion() {
        int result = Engine.makeNumber();
        setQuestion(result);
        return String.valueOf(result);
    }

    public static int getQuestion() {
        return question;
    }

    public static void setQuestion(int q) {
        Prime.question = q;
    }

}
