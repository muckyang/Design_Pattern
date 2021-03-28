package BehavioralPattern.Strategy.Before;

public class AirCar extends Car {

    public AirCar(String name) {
        super(name);
    }

    public void move() {
//        System.out.println(this.getName() + "는 도로를 달릴 수 있습니다." );
        System.out.println(this.getName() + "는 하늘을 날 수 있습니다.");
    }
}
