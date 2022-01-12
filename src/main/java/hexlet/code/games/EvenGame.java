package hexlet.code.games;


import hexlet.code.Engine;

public class EvenGame {
    public static void playEvenGame() {
        Engine.setInstruction("Answer 'yes' if number even otherwise answer 'no'.");

        Engine.setFirstQuestion(String.valueOf(Engine.makeNumber()));
        Engine.setFirstCorrectAnswer((isEven(Integer.parseInt(Engine.getFirstQuestion())) ? "yes" : "no"));

        Engine.setSecondQuestion(String.valueOf(Engine.makeNumber()));
        Engine.setSecondCorrectAnswer((isEven(Integer.parseInt(Engine.getSecondQuestion())) ? "yes" : "no"));

        Engine.setThirdQuestion(String.valueOf(Engine.makeNumber()));
        Engine.setThirdCorrectAnswer((isEven(Integer.parseInt(Engine.getThirdQuestion())) ? "yes" : "no"));

        Engine.playGame();
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
//
//    public String makeQuestion() {
//        return String.valueOf(makeNumber());
//    }
//
//    public String makeCorrectAnswer() {
//        return (isEven(Integer.parseInt(getQuestion()))) ? "yes" : "no";


}
