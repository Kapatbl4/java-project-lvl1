package hexlet.code;


public class EvenGame extends Engine {
    public void playEvenGame() {
        playGame();
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int makeNumber() {
        final int ten = 10;
        int a = (int) (Math.random() * ten);
        int b = (int) (Math.random() * ten);
        return a * b;
    }

    public String makeQuestion() {
        return String.valueOf(makeNumber());
    }

    public String makeCorrectAnswer() {
        return (isEven(Integer.parseInt(question))) ? "yes" : "no";
    }
}
