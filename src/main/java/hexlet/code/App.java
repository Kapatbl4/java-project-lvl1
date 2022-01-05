package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case (1) :
                System.out.println("Welcome to the Brain Games!");
                Cli.askName();
                break;

            case (2) :
                EvenGame evenGame = new EvenGame();
                evenGame.playEvenGame();
                break;

            case (3) :
                Calc calc = new Calc();
                calc.calcGame();
                break;

            case (4) :
                GCD gcd = new GCD();
                gcd.gcdGame();
                break;

            case (5) :
                Progression progression = new Progression();
                progression.playProgression();
                break;

            default:
        }

    }
}
