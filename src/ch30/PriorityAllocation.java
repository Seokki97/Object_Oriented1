package ch30;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객이 우수한 상담원에게 배정됩니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배분합니다.");
    }

}
