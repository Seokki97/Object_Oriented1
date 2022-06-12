package program;

public class Score {
    private Subject subjectName;
    private int point;

    public Score(Subject subjectName, int point){
        this.subjectName = subjectName;
        this.point = point;
    }

    public Subject getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(Subject subjectName) {
        this.subjectName = subjectName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
