package com.example.orders;

public class Demo {
    public static void main(String[] args) {
        OrderFactory factory = new BabyProductOrderFactory();

        Order order1 = factory.createOrder("diaper");
        order1.processOrder();

        Order order2 = factory.createOrder("milk");
        order2.processOrder();

        Order order3 = factory.createOrder("clothes");
        order3.processOrder();
    }
}
