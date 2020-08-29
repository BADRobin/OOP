package com.javalessons.firststep.innerclass;

public class Main {
    public static void main(String[] args) {


    CellPhone cellPhone = new CellPhone("Nokia", "3310");
    cellPhone.turnOn();
//    Display display = cellPhone.getDisplay();
//    Display.Pixel pixel = display.new Pixel(25,100255, Display.Color.BLOOD);
//    Display.Pixel pixel = new Display.Pixel(25,45, Display.Color.MAGENTA);
//        Display.Pixel pixel = cellPhone.getDisplay().new Pixel(123, 123, Display.Color.GREEN);
//        pixel.testScope(450);

        cellPhone.call("1234567890");
    }
}
