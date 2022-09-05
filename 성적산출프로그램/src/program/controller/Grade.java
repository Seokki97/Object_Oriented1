package program.controller;

import program.model.Score;

public class Grade {
    private Score score;

    public String getGrade(Score score){
        String grade;

        if(score.getPoint() >=90 && score.getPoint() <=100)
            grade = "A";
        else if(score.getPoint() >=80 && score.getPoint() <=89)
            grade = "B";
        else if(score.getPoint() >=70 && score.getPoint() <=79)
            grade = "C";
        else if(score.getPoint() >=55 && score.getPoint() <=69)
            grade = "D";
        else
            grade = "F";
        return grade;

    }


}
