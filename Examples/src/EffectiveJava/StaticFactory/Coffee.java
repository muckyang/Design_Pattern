package EffectiveJava.StaticFactory;

public class Coffee {
    int price, makeTime, calories;

    public Coffee(int price, int makeTime, int calories) {
        this.price = price;
        this.makeTime = makeTime;
        this.calories = calories;
    }


    public static Coffee newAmericano() {
        return new Coffee(4100, 5, 5);
    }

    public static Coffee newCafeLatte() {
        return new Coffee(4600, 10, 50);
    }

}
