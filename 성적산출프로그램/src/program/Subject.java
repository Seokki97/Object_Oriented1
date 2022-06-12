package program;

public class Subject {
    private String major;
    private String essentialSubject;
    private String subjectName;
    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return major;
    }

    public void setSubjectName(String subjectName) {
        this.major = major;
    }
    public String selectMajor(){
        if(major.equals("국어국문학과")){
        subjectName = "국어";
        }
        if(major.equals("컴퓨터공학과")){
        subjectName = "수학";
        }
        return subjectName;
    }
}
