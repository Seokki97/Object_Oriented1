package ch29;

public interface PlayerLevel {

    void run();
    void jump();
    void turn();

    void showLevelMessage();

    default void go(int count){

    };
}
