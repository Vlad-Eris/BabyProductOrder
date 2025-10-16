package com.example.orders;

public class DiaperOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Procesare comandă pentru scutece bebeluși.");
    }
}
