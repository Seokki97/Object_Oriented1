package ch10;

import java.util.ArrayList;

public class MemberArrayList {
    ArrayList<Member> memberArrayList ;

    public MemberArrayList(){
        memberArrayList = new ArrayList<>();
    }
    public Member addMember(Member member){
        memberArrayList.add(member.);
        return member;
    };

    public Member removeMember(Member member){
        memberArrayList.remove(member);
        return member;
    };

    public void showAllMember(){
    for(int i =0; i < memberArrayList.size(); i++){
        System.out.println(memberArrayList.get(i));
    }
    };

}
