package EffectiveJava.Builder;

public class BuilderExample {
    public static void main(String[] args) {
        Order order = new Order.Builder(1L)
                .username("userName")
                .menuId(20)
                .quantity(30)
                .price(4000)
                .build();
    }
}
