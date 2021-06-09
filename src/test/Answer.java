package test;

public class Answer {
    public String trueAnswer;

    public Answer(String trueAnswer){
        this.trueAnswer = trueAnswer;
    }

    public Boolean isCorrect(String selectedItem){
        if(trueAnswer == selectedItem){
            return true;
        }
        else{
            return false;
        }
    }
}
