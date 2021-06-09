package test;

import java.util.Scanner;

public class Question {
    public String text;
    public String[] answerOptions;
    public String selectedOption;
    public Answer trueAnswer;

    public Question(String text, String[] answerOptions, Answer trueAnswer) {
        this.text = text;
        this.answerOptions = answerOptions;
        this.trueAnswer = trueAnswer;
    }

    public void askQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        System.out.println("Виберіть правильну відпопідь: ");
        for (int i = 0; i < answerOptions.length; i++) {
            System.out.println(i + 1 + "." + " " + answerOptions[i]);
        }
        selectedOption = answerOptions[scanner.nextInt() - 1];
    }

    public static void main(String[] args) {
        Question question1 = new Question("Скільки буде 2 + 2", new String[]{"2", "3", "4", "6"}, new Answer("4"));
        Question question2 = new Question("Скільки буде 3 + 2", new String[]{"32", "5", "644", "96"}, new Answer("5"));
        Question question3 = new Question("Скільки буде 3 + 3", new String[]{"12", "55", "14", "6"}, new Answer("6"));
        Question question4 = new Question("Скільки буде 3 * 3", new String[]{"81", "17", "0", "9"}, new Answer("9"));
        Question question5 = new Question("Скільки буде 12 * 12", new String[]{"144", "27", "80", "35"}, new Answer("144"));
        Question question6 = new Question("Скільки буде 20 + 2", new String[]{"20", "21", "22", "12"}, new Answer("22"));
        Question question7 = new Question("Скільки буде 2 * 2", new String[]{"2", "8", "4", "6"}, new Answer("4"));
        Question question8 = new Question("Скільки буде 2 - 2", new String[]{"0", "2", "4", "6"}, new Answer("0"));
        Question question9 = new Question("Скільки буде 2 + 4", new String[]{"2", "3", "4", "6"}, new Answer("6"));
        Question question10 = new Question("Скільки буде 4 * 1", new String[]{"16", "3", "4", "5"}, new Answer("4"));

        Question[] questions = {question1, question2, question3, question4, question5, question6, question7, question8, question9, question10};
        Game mainGame = new Game(questions);
        mainGame.play();
        mainGame.compareAnswers();
    }
}




