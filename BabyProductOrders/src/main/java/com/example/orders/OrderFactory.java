package com.example.orders;

public abstract class OrderFactory {
    public abstract Order createOrder(String productType);
}
