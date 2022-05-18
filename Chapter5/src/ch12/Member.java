package ch12;

public class Member {

    private String memberName;
    private int memberId;

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

}
