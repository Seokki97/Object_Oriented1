package ch04;

    public class StudentTest {
        public static void main(String[] args) {
            Practice studentLee =  new Practice(); //생성자

            studentLee.studentID = 12345;
            studentLee.setStudentName("Lee");
            studentLee.address = "강남구";

            studentLee.showStudentInfo();
        }
    }

