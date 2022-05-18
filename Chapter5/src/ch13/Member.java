package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private String memberName;
    private int memberId;

    public Member(){};
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;

    }


    //이게 중복을 정의해주는 equals메서드를 재정의해준거
    @Override
    public int hashCode() {
        return memberId;
    }


    //compararoator 을 쓰면 이렇게 해야하는데 컴파일 오류가난다. 그래서 compare되는 대상을 반드시 써줘야한다.
    @Override
    public int compare(Member o1, Member o2) { //하나는 자신 하나는 비교대상
        return (o1.memberId - o2.memberId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj; //obj를 member로 다운캐스팅
            if (this.memberId == member.memberId)
                return true;
             else
                return false;


        }
        return false;
    }

    @Override
    public String toString(){
        return memberId + memberName;
    }

    //this.memberId가 comparable로 넘어온 memberid보다 크면 오른쪽, 작으면 왼쪽 같으면 중복이라 무시
    //내림차순으로 하고 싶으면 반환값을 반대로
 /*   @Override
    public int compareTo(Member o) {
        if(this.memberId > o.memberId){
            return 1;
        }
        else if (this.memberId < o.memberId){
            return -1;
        }
        else return o.memberId;
    }*/
}
