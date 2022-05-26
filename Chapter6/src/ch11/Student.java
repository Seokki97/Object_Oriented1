package ch11;

public class Student {
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {

        if (studentName == null){
            throw new StudentNameFormatException("null");
        }
        else if(studentName.split(" ").length > 3){
            throw new StudentNameFormatException("공백 오류 ");

        }
        this.studentName = studentName;
    }

    MyLogger myLogger = MyLogger.getLogger();

}
