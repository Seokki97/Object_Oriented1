package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    ArrayList<Member> memberArrayList ;

    public MemberArrayList(){
        memberArrayList = new ArrayList<>();
    }
    public void addMember(Member member){
        memberArrayList.add(member);
    };

    public boolean removeMember(int memberId){
        Iterator<Member> ir =  memberArrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                memberArrayList.remove(member);
                return true
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


