package hexlet.code.games;


import hexlet.code.Engine;

public class EvenGame extends Engine {
    public void playEvenGame() {
        setInstruction("Answer 'yes' if number even otherwise answer 'no'.");
        playGame();
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String makeQuestion() {
        return String.valueOf(makeNumber());
    }

    public String makeCorrectAnswer() {
        return (isEven(Integer.parseInt(getQuestion()))) ? "yes" : "no";
    }
}
