package hexlet.code;


public class EvenGame extends Engine {
    public void playEvenGame() {
        playGame();
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String makeQuestion() {
        return String.valueOf(makeNumber());
    }

    public String makeCorrectAnswer() {
        return (isEven(Integer.parseInt(question))) ? "yes" : "no";
    }
}
