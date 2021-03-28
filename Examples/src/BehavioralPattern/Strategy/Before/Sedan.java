package BehavioralPattern.Strategy.Before;

public class Sedan extends Car {

    public Sedan(String name) {
        super(name);
    }

    public void move() {
        System.out.println(this.getName() + "는 도로를 달릴 수 있습니다.");
    }
}
