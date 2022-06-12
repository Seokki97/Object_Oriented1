package program;

public class EssentialSubjectEvaluation implements Evaluation {

    @Override
    public String getScore(int score) {
        String grade;
        if (score >= 95 && score <= 100)
            grade = "A";
        else if (score >= 90 && score <= 94)
            grade = "B";
        else if (score >= 70 && score <= 79)
            grade = "C";
        else if (score >= 60 && score <= 69)
            grade = "D";
        else
            grade = "F";
        return grade;
    }
}

