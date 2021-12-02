package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static StringBuilder staticName = new StringBuilder();
    public static void askName() {
        System.out.print("May I ask your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println();
        staticName.append(userName);
        System.out.println("Hello, " + userName + "!");
//        scanner.close();
    }
    public static String getName() {
        return String.valueOf(staticName);
    }
}
