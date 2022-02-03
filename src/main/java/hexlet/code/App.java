package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice) {
            case ("1") :
                Cli.sayHello();
                break;

            case ("2") :
                EvenGame.playEvenGame();
                break;

            case ("3") :
                Calc.playCalcGame();
                break;

            case ("4") :
                GCD.gcdGame();
                break;

            case ("5") :
                Progression.playProgression();
                break;

            case ("6") :
                Prime.playPrime();
                break;

            default:
        }

    }
}
