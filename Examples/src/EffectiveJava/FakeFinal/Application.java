package EffectiveJava.FakeFinal;

public class Application {
    public static void main(String[] args) {

        int[] first = NotSingle.STORE;
        int[] second = NotSingle.STORE;
        first[0] = 100;
        print(first);
        print(second);// why ?

        int one = NotSingle.INSTANCE;
        int two = NotSingle.INSTANCE;
        one = 11;
        System.out.println(one);
        System.out.println(two);
    }

    private static void print(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
