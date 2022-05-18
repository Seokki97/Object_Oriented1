package ch12;

import java.util.HashSet;

public class MemberHashSet {

    private HashSet<Member> hashSet ;

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    };

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    };

}
