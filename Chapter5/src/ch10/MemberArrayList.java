package ch10;

import java.util.ArrayList;

public class MemberArrayList {
    ArrayList<Member> memberArrayList ;

    public MemberArrayList(){
        memberArrayList = new ArrayList<>();
    }
    public void addMember(Member member){
        memberArrayList.add(member);
    };

    public boolean removeMember(int memberId){
        for(int i = 0; i < memberArrayList.size() ; i++){
            Member member = memberArrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){
                memberArrayList.remove(i);
                return true;
            }
        }
         return false;
    }

    public void showAllMember(){
        for(Member member : memberArrayList){
            System.out.println(member);
        }

    }

}


