package Patterns.StrucuralPattern.Facade.After;

public class Test {
    public static void main(String[] args) {
      CoffeeMaker cm = new CoffeeMaker();

      cm.makeVanillaLatte();
      cm.makeAmericano();
      cm.makeCafeMocha();

    }

}
