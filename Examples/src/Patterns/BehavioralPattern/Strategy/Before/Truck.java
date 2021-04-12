package Patterns.BehavioralPattern.Strategy.Before;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    public void move() {
//        System.out.println(this.getName() + "는 도로를 달릴 수 있습니다." );
        System.out.println(this.getName() + "는 화물을 적재할 수 있습니다.");
    }
}
