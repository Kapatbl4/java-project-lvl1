package hexlet.code;

import java.util.Random;

public class Utils {
    static final int STANDARD_MAX = 99;
    public static int makeNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int makeNumber(int max) {
        return makeNumber(1, max);
    }

    public static int makeNumber() {
        return makeNumber(0, STANDARD_MAX);
    }
}
