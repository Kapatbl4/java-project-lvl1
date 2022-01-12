package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String firstQuestion;
    private static String secondQuestion;
    private static String thirdQuestion;
    private static String firstCorrectAnswer;
    private static String secondCorrectAnswer;
    private static String thirdCorrectAnswer;
    private static String instruction;
    private static String answer;

    public static int makeNumber() {
        final int tenForRandom = 10;
        int a = (int) (Math.random() * tenForRandom);
        int b = (int) (Math.random() * tenForRandom);
        return a * b;
    }
    public static void setFirstQuestion(String question) {
        Engine.firstQuestion = question;
    }

    public static String getFirstQuestion() {
        return firstQuestion;
    }

    public static void setSecondQuestion(String question) {
        Engine.secondQuestion = question;
    }

    public static String getSecondQuestion() {
        return secondQuestion;
    }

    public static void setThirdQuestion(String third) {
        Engine.thirdQuestion = third;
    }

    public static String getThirdQuestion() {
        return thirdQuestion;
    }

    public static String getFirstCorrectAnswer() {
        return firstCorrectAnswer;
    }

    public static void setFirstCorrectAnswer(String first) {
        Engine.firstCorrectAnswer = first;
    }

    public static String getSecondCorrectAnswer() {
        return secondCorrectAnswer;
    }

    public static void setSecondCorrectAnswer(String second) {
        Engine.secondCorrectAnswer = second;
    }

    public static String getThirdCorrectAnswer() {
        return thirdCorrectAnswer;
    }

    public static void setThirdCorrectAnswer(String third) {
        Engine.thirdCorrectAnswer = third;
    }

    public static void setAnswer(String a) {
        Engine.answer = a;
    }

    public static String getAnswer() {
        return answer;
    }

    public static void setInstruction(String input) {
        instruction = input;
    }

    public static String getInstruction() {
        return instruction;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
    }
    public static void playGame() {
        greeting();
        Cli.askName();
        System.out.println(getInstruction());
        System.out.println("Question: " + getFirstQuestion());
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        setAnswer(scanner.nextLine());
        if (getAnswer().equals(getFirstCorrectAnswer())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '"
                        + getFirstCorrectAnswer() + "'.\n"
                        + "Let's try again, "
                        + Cli.getName() + "!");
            System.exit(0);
        }

        System.out.println("Question: " + getSecondQuestion());
        System.out.print("Your answer: ");
        setAnswer(scanner.nextLine());
        if (getAnswer().equals(getSecondCorrectAnswer())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '"
                    + getSecondCorrectAnswer() + "'.\n"
                    + "Let's try again, "
                    + Cli.getName() + "!");
            System.exit(0);
        }

        System.out.println("Question: " + getThirdQuestion());
        System.out.print("Your answer: ");
        setAnswer(scanner.nextLine());
        if (getAnswer().equals(getThirdCorrectAnswer())) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + Cli.getName() + "!");
        } else {
            System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '"
                    + getThirdCorrectAnswer() + "'.\n"
                    + "Let's try again, "
                    + Cli.getName() + "!");
            System.exit(0);
        }
    }
}

//    public static void playGame() {
//        System.out.println(greeting);
//        Cli.askName();
//        System.out.println(getInstruction());
//        int trueAnswersCount = 0;
//        final int win = 3;
//        while (trueAnswersCount < win) {
//            setQuestion(makeQuestion());
//            System.out.println("Question: " + getQuestion());
//            correctAnswer = makeCorrectAnswer();
//            System.out.print("Your answer: ");
//            Scanner scanner = new Scanner(System.in);
//            answer = scanner.nextLine();
//            if (answer.equals(correctAnswer)) {
//                System.out.println("\nCorrect!");
//                trueAnswersCount++;
//            } else {
//                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
//                            + correctAnswer + "'.\n"
//                            + "Let's try again, "
//                            + Cli.getName() + "!");
//                    break;
//                }
//            }
//        if (trueAnswersCount == win) {
//            System.out.println("Congratulations, " + Cli.getName() + "!");
//        }
//    }
//    public static String makeCorrectAnswer() {
//        return "";
//    }
//
//    public static String makeQuestion() {
//        return "";
//    }
