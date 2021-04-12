package Patterns.BehavioralPattern.Strategy.Before;

public class Test {
    public static void main(String[] args) {
        Car sedan = new Sedan("Genesis G70");
        Car truck = new Truck("Volvo FE");
        Car airCar = new AirCar("AirCar");

        sedan.move();
        truck.move();
        airCar.move();
    }
    /*
    상황에 따라 원하는 기능을 사용할 수 없다.
    ex)airCar 의 경우 하늘을 날 수도 있지만, 도로를 달릴 수도 있어야 한다.

    다른 차종이 추가 되었을 때 동일한 내용의 move메소드가 중복해서 작성 될 가능성이 열려있다.
     */

}
