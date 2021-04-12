package EffectiveJava.StaticFactory;

public class StaticFactoryExample {
    public static void main(String[] args) {

        // 1
        Coffee americano = Coffee.newAmericano();
        Coffee cafeLatte = Coffee.newCafeLatte();

        // 2
        CoffeeNotNew americano2 = CoffeeNotNew.getAmericano();
        CoffeeNotNew cafeLatte2 = CoffeeNotNew.getCafeLatte();

        // 3
        Order order1 = Order.getOrder(5000,"americano","123456123456");
        Order order2 = Order.getOrder(5500,"caffeLatte","1234567812345678");

        System.out.println(order1.getClass()+ " "+ (order1 instanceof HallOrder));
        System.out.println( order2.getClass()+ " "+ (order2 instanceof DeliveryOrder));

        // 4
        Member member = new Member("1",12341234,"factoryMethod");
        MemberDto memberDto = MemberDto.from(member);
        System.out.println(memberDto.toString());
    }
}
