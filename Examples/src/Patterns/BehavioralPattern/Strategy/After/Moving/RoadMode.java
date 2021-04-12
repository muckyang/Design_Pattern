package Patterns.BehavioralPattern.Strategy.After.Moving;

public class RoadMode implements MovingStrategy {
    public void move() {
        System.out.println("도로를 달릴 수 있습니다.");
    }
}
