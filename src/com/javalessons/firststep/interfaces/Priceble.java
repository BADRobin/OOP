package com.javalessons.firststep.interfaces;

public interface Priceble extends Deliverable, Orderable{
    default int calcPrice(){
        return calcOrderPrice()+calcDeliveryPrice();
    }

    static void doSmth(){

    }
}
