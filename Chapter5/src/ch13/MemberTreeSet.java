package ch13;

import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet ;

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member){
        treeSet.add(member);
    };

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    };


}
