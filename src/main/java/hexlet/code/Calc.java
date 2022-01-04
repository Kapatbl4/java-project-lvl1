package hexlet.code;

public class Calc extends Engine{
    public void calcGame() {
        playGame();
    }

    @Override
    public String makeCorrectAnswer() {
        String[] strings = getQuestion().split(" ");
        int result;
        int first = Integer.parseInt(strings[0]);
        int second = Integer.parseInt(strings[2]);
        switch (strings[1]) {
            case ("+") :
                result = first + second;
                break;
            case ("-") :
                result = first - second;
                break;
            default: result = first * second;
        }
        return String.valueOf(result);
    }

    @Override
    public String makeQuestion() {
        char sign;
        int i = makeNumber();
        if (i < 10) {
            sign = '+';
        } else if (i < 20) {
            sign = '-';
        } else sign = '*';

        int first = makeNumber();
        int second = makeNumber();

        return first + " " + sign + " " + second;
    }
}
