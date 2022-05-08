package ch30;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 통화수가 가장 적은 상담원에게 배분합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배분합니다.");
    }
}
