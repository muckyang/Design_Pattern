package EffectiveJava.Builder;

public class Order {
    private final Long id;
    private final String username;
    private final int menuId;
    private final int quantity;
    private final int price;

    private Order(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.menuId = builder.menuId;
        this.quantity = builder.quantity;
        this.price = builder.price;
    }

    public static class Builder {
        private final Long id;
        private String username;
        private int menuId;
        private int quantity;
        private int price;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder menuId(int menuId) {
            this.menuId = menuId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
