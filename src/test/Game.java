package test;

public class Game {
    public Question[] questions;
    public int score;

    public Game(Question[] questions){
        this.score = 0;
        this.questions = questions;
    }

    public void play(){
        for(Question question : questions){
            question.askQuestion();
            if(question.trueAnswer.isCorrect(question.selectedOption)){
                score++;
            }
        }
        System.out.println("Гра завершена. Ви отримали: " + score + " балів");
        System.out.println();
    }

    public void compareAnswers(){
        for(Question question : questions){
            if(question.trueAnswer.isCorrect(question.selectedOption)){
            }
            else {
                System.out.println("Ви неправильно відповіли на питання: ");
                System.out.println("Питання: " + question.text + ". Ви вибрали " + question.selectedOption + ". Правильна відповідь " + question.trueAnswer.trueAnswer);
            }
        }
    }
}
