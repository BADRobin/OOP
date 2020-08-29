package com.javalessons.firststep.interfaces;

public abstract class Electronics implements Priceble {

    private String make;
    private String model;
    private int quantity;
    private int price;

    public Electronics(String make, String model, int quantity, int price) {
        this.make = make;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int calcDeliveryPrice() {
        return 0;
    }

    @Override
    public int calcOrderPrice() {
        return getQuantity() * getPrice();
    }
}
