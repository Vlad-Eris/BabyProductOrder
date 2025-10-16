package com.example.orders;

public class ClothesOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Procesare comandă pentru haine bebeluși.");
    }
}
