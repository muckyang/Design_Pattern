package BehavioralPattern.Strategy.After.Moving;

public class FlyMode implements MovingStrategy {
    public void move() {
        System.out.println("하늘을 날 수 있습니다..");
    }
}
