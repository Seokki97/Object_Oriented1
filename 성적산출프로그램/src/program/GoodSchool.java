package program;

import java.util.ArrayList;
import java.util.List;

public class GoodSchool {
    public static void main(String[] args) {


        Subject computerScience = new Subject("컴퓨터공학과");
        Subject korean = new Subject("국어국문학과");
        Student Kim = new Student("김준석", 20172719, computerScience);
        Student Lee = new Student("이시영", 2051321, korean);
        Score score = new Score(korean, 95);
        ArrayList<Student> asd = new ArrayList<>();
        asd.add(Kim);
        asd.add(Lee);
        System.out.println(asd);
        ArrayList<Score> score1 = new ArrayList<>();
        score1.add(score);
        System.out.println(score1.toString());
    }

}
