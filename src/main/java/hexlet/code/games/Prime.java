package hexlet.code.games;

import hexlet.code.Engine;


public class Prime extends Engine {
    public void playPrime() {
        setInstruction("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        playGame();
    }

    @Override
    public String makeCorrectAnswer() {
        int question = Integer.parseInt(getQuestion());
        if (question == 0) return "no";
        if (question < 4) return "yes";
        if (question % (int) (Math.sqrt(question)) == 0) return "no";
        for (int i = 2; i < Math.sqrt(question); i++) {
            if (question % i == 0) return "no";
        }
        return "yes";
    }

    @Override
    public String makeQuestion() {
        return String.valueOf(makeNumber());
    }
}
