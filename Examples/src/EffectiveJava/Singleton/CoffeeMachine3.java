package EffectiveJava.Singleton;

public enum CoffeeMachine3 {
    INSTANCE;
    static final String id = "CM-03";

    public String getId() {
        return id;
    }
}
