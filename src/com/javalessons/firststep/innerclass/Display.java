package com.javalessons.firststep.innerclass;

public class Display {
    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x = 0;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.RED);
    }

    private class Pixel {
        private int x;
        private int y;
        private Color color;

        public Pixel(int x, int y, Color color) {
            if (0 <= x && x <= DISPLAY_WIDTH && 0 <= y && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Создаем " + color + " пиксель в (" + x + " , " + y + ")");
            } else {
                throw new IllegalArgumentException("Координаты Х и Y должны быть в пределах 0 - " + DISPLAY_WIDTH + " и 0 - " + DISPLAY_HEIGHT);
            }
        }

//        public void testScope(int x){
//            System.out.println("X= " + x);
//            System.out.println("this.x= " + this.x);
//            System.out.println("Display.this.x= " + Display.this.x);
//        }

    }

    public enum Color {
        RED, GREEN, BLUE, MAGENTA, YELLOW, BLACK, BLOOD
    }


}
