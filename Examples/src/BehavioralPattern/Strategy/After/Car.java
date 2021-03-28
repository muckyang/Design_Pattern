package BehavioralPattern.Strategy.After;


import BehavioralPattern.Strategy.After.Moving.MovingStrategy;

public abstract class Car {
    private final String name;
    private MovingStrategy movingStrategy;

    public Car(String name) {
        this.name = name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public String getName() {
        return this.name;
    }
    public void move(){
        System.out.print(this.name + "는 ");
        movingStrategy.move();
    }

}
