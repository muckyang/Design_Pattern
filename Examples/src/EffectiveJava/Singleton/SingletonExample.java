package EffectiveJava.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println(CoffeeMachine.INSTANCE.getId());
        System.out.println(CoffeeMachine2.id);
        System.out.println(CoffeeMachine3.INSTANCE.getId());
    }
}
