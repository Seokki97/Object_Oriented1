package program;

public class Score {
    private int score;
    private String grade;
    public Score(int score, String grade){
        this.score = score;
        this.grade = grade;
    }

    public String nomalSubjectScore(){
        if(score>=90 && score<=100){
            grade = "A";
        }
        if(score>=80 && score<=89){
            grade ="B";
        }
        if(score>=70 && score<=79){
            grade ="C";
        }
        if(score>=55 && score<=69){
            grade = "D";
        }
        if(score<55){
            grade = "F";
        }
        return grade;
    }

    public String EssentialSubjectScore(){
        if(score>=95 && score<=100){
            grade = "S";
        if(score>=90 && score<=94){
            grade = "A";
        }
        if(score>=80 && score<=89){
            grade ="B";
        }
        if(score>=70 && score<=79){
            grade ="C";
        }
        if(score>=60 && score<=69){
            grade = "D";
        }
        if(score<60){
            grade = "F";
        }
        return grade;
    }

}
