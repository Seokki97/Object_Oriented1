package ArrayListReview;

public class Execute {
    public static void main(String[] args) {
        Student kim = new Student("김");
        Student lee = new Student("이");

        kim.getStudentId();
        kim.setStudentId();
        kim.showStudentInfo();

        lee.getStudentId();
        lee.setStudentId();
        lee.showStudentInfo();
    }
}
