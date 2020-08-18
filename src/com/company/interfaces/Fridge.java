package com.company.interfaces;

public class Fridge extends Electronics{


    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }


    @Override
    public int calcDeliveryPrice() {
        if (getPrice() >= 200)
            return 0;
        else {
            return 25;
        }
    }

    @Override
    public int calcOrderPrice() {
        return getQuantity() * getPrice();
    }
}
