package EffectiveJava.Singleton;

public class CoffeeMachine {
    public static final CoffeeMachine INSTANCE = new CoffeeMachine();
    String id;

    private CoffeeMachine() {
        id = "CM-01";
    }

    public String getId() {
        return id;
    }
}
