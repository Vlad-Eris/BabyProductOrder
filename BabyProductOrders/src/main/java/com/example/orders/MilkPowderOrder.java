package com.example.orders;

public class MilkPowderOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Procesare comandă pentru lapte praf bebeluși.");
    }
}
