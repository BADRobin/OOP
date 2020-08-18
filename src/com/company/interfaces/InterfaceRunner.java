package com.company.interfaces;

import static java.lang.Integer.sum;

public class InterfaceRunner {
    public static void main(String[] args) {
//        Deliverable[] deliverable = new Deliverable[3];
        Priceble pizza = new Pizza("Neopolitana", 1 , 20,Size.L);
        Priceble cellPhone = new CellPhone("Nokia", "3310", 1, 25);
        Priceble fridge = new Fridge("Nord", "xxa1542", 1 , 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(cellPhone);
        printDeliveryPrice(fridge);
//        System.out.println( "Total "+ ()Integer.sum(printDeliveryPrice(pizza), printDeliveryPrice(cellPhone)));
    }
    private static void printDeliveryPrice(Priceble deliverable){

        System.out.println("Delivery price " + deliverable.calcDeliveryPrice());
        System.out.println("Order price " + deliverable.calcOrderPrice());
        System.out.println("Total " + deliverable.calcPrice());
    }

}
