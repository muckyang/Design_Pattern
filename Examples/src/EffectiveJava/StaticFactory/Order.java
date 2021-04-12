package EffectiveJava.StaticFactory;

public  class Order {
    int price;
    String menu;

    public static Order getOrder(int price , String menu, String orderNum){
        if(isHallOrder(orderNum)){
           return new HallOrder(price,menu);
        }else if(isDeliveryOrder(orderNum)){
            return new DeliveryOrder(price,menu);
        }else{
            return null;
        }
    }
    private static boolean isHallOrder(String orderNum){
        return orderNum.length() == 12;
    }
    private static boolean isDeliveryOrder(String orderNum){
        return orderNum.length() == 16;
    }

}
class HallOrder extends Order {
    int tableNum;
    public HallOrder(int price, String menu){
        this.price =price;
        this.menu=menu;
        this.tableNum = 1;
    }
}

class DeliveryOrder extends Order {
    int deliveryNum;
    public DeliveryOrder(int price, String menu){
        this.price =price;
        this.menu=menu;
        this.deliveryNum = 1;
    }
}
