package StrucuralPattern.Facade.After;

public class CoffeeMaker {
    private final Coffee americano;
    private final Coffee vanillaLatte;
    private final Coffee cafeMocha;

    public CoffeeMaker(){
        americano = new Americano();
        vanillaLatte = new VanillaLatte();
        cafeMocha = new CafeMocha();
    }

    public void makeAmericano(){
        americano.make();
    }

    public void makeVanillaLatte(){
        vanillaLatte.make();
    }

    public void makeCafeMocha(){
        cafeMocha.make();
    }
}
