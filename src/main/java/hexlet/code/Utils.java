package hexlet.code;

import java.util.Random;

public class Utils {
    public static int makeNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int makeNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public static int makeNumber() {
        final int standardMax = 99;
        return makeNumber(standardMax);
    }
}
