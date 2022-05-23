package ch04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Jun");
        sList.add("siyoung");
        sList.add("chan");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.print(s+" "));
        System.out.println(" ");
        //기존 스트림 재사용 불가능함

        sList.stream().sorted().forEach(s->System.out.println(s+ " "));

        sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
        sList.stream().filter(s->s.length()>=5).forEach(k->System.out.println(k));
    }
}
