package ch30;

public interface Scheduler {
    abstract void getNextCall();
    abstract void sendCallToAgent();
}
