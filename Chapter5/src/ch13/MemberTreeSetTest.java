package ch13;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");



        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }

}
