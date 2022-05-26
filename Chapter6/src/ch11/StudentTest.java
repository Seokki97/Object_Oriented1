package ch11;

public class StudentTest {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();
        Student student = new Student();
        String name = null;
        try{
            student.setStudentName(null);

        }catch( StudentNameFormatException e ){
            myLogger.warning(e.getMessage());
        }

        try{
            student.setStudentName("Edward Jon Kim Test");
        }catch ( StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        try {
            student.setStudentName("James");
            student.getStudentName();
        }catch (StudentNameFormatException e){
            System.out.println(e);
    }

}
}
