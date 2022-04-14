package ArrayListReview;

public class Execute {
    public static void main(String[] args) {
        Student kim = new Student(2);
        Student lee = new Student(3);

        kim.getStudentId();
        kim.setStudentId();
        kim.showStudentInfo();

        lee.getStudentId();
        lee.setStudentId();
        lee.showStudentInfo();
    }
}
