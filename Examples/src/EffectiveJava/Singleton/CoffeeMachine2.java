package EffectiveJava.Singleton;

public class CoffeeMachine2 {
    //private!
    private static final CoffeeMachine2 INSTANCE = new CoffeeMachine2();
    static String id;

    private CoffeeMachine2() {
        id = "CM-02";
    }

    public static CoffeeMachine2 getInstance(){
       return INSTANCE;
    }

    public static String getId(){
        return id;
    }
}
