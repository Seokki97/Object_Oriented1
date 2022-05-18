package ch12;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("김준석"));
        hashSet.add(new String("이시영"));
        hashSet.add(new String("김준돌"));
        hashSet.add(new String("이시돌"));
        hashSet.add(new String("이시돌"));

        System.out.println(hashSet);
    }
}
