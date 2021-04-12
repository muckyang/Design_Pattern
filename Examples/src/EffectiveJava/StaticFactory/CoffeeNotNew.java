package EffectiveJava.StaticFactory;

public class CoffeeNotNew {
    int price, makeTime, calories;

    private static final CoffeeNotNew AMERICANO = new CoffeeNotNew(4100, 5, 5);
    private static final CoffeeNotNew CAFELATTE = new CoffeeNotNew(4600, 10, 5);

    public CoffeeNotNew(int price, int makeTime, int calories) {
        this.price = price;
        this.makeTime = makeTime;
        this.calories = calories;
    }

    public static CoffeeNotNew getAmericano() {
        return AMERICANO;
    }

    public static CoffeeNotNew getCafeLatte() {
        return CAFELATTE;
    }
}
