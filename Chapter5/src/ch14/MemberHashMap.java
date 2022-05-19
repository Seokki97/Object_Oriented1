package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap; //integer가 키 member가 value

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member); //put(key, value)
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){ //key값을 반환 containsValue도있음
            hashMap.remove(memberId);
            return true;
        }

        System.out.println(memberId + "가 존재 x");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); //keySet=모든 키값
        while (ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
