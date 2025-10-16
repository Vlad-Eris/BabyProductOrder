package com.example.orders;

public class BabyProductOrderFactory extends OrderFactory {
    @Override
    public Order createOrder(String productType) {
        if (productType == null) {
            return null;
        }
        switch (productType.toLowerCase()) {
            case "diaper":
                return new DiaperOrder();
            case "milk":
                return new MilkPowderOrder();
            case "clothes":
                return new ClothesOrder();
            default:
                throw new IllegalArgumentException("Tip produs necunoscut: " + productType);
        }
    }
}
