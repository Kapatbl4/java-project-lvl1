package hexlet.code;

public class Utils {
    public static int makeNumber() {
        final int tenForRandom = 10;
        int a = (int) (Math.random() * tenForRandom);
        int b = (int) (Math.random() * tenForRandom);
        return a * b;
    }

    public static int makeFromOneToTen() {
        final int tenForRandom = 10;
        return (int) (Math.random() * tenForRandom);
    }
}
