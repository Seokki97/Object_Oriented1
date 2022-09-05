package program;

import program.model.Student;
import program.model.Subject;

public class GradeEvaluationAplication {
    public static void main(String[] args) {
        Subject korean = new Subject(1,"국어", 1);
        Subject math = new Subject(2,"수학",2);
        Student studentKang = new Student("강감찬",211213, korean );
        Student studentKim = new Student("김준석",20391, math);

        korean.addRegister(studentKang);
        math.addRegister(studentKim);

        System.out.println(korean.toString());
        System.out.println(math.toString());
    }
}
