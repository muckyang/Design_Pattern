package Patterns.BehavioralPattern.Strategy.After;

import Patterns.BehavioralPattern.Strategy.After.Moving.FlyMode;
import Patterns.BehavioralPattern.Strategy.After.Moving.LoadCargo;
import Patterns.BehavioralPattern.Strategy.After.Moving.RoadMode;

public class Test {
    public static void main(String[] args) {
        Car sedan = new Sedan("Genesis G70");
        Car truck = new Truck("Volvo FE");
        Car airCar = new AirCar("AirCar");

        sedan.setMovingStrategy(new RoadMode());
        sedan.move();

        truck.setMovingStrategy(new RoadMode());
        truck.move();
        truck.setMovingStrategy(new LoadCargo());
        truck.move();

        airCar.setMovingStrategy(new RoadMode());
        airCar.move();
        airCar.setMovingStrategy(new FlyMode());
        airCar.move();

    }
    /*  모드를 명시하여 상황에 따라 전략적으로 설정 할 수 있다.
        새로운 모드를 추가하게 되더라도 클래스 하나만 추가하면 된다.(다른 파일은 영향 없음)
     */
}
