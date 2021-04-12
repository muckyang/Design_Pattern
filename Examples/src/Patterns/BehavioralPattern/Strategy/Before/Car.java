package Patterns.BehavioralPattern.Strategy.Before;

public abstract class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void move();
}
