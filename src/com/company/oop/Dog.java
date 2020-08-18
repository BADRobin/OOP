package com.company.oop;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Количество собак - " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public int getPaws() {
        return PAWS;
    }

//    protected void setPaws(int paws) {
//        if(paws == 4) {
//            this.PAWS = paws;
//        }else {
//            this.PAWS = 4;
//            System.out.println("Чего??? " + paws + " лап - как???");
//        }
//    }

    public int getTail() {
        return TAIL;
    }

//    public void setTail(int tail) {
//
//        this.TAIL = tail;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
//        if(size.equalsIgnoreCase("Big") || size.equalsIgnoreCase("Average") ||
//                                                        size.equalsIgnoreCase("Small") ) {
//            this.size = size;
//        }else {
//            System.out.println("Size should be  Big or Average or  Small");
//        }
        this.size = size;
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Тебя покусали ");
        } else {
            bark();
        }
    }

    public void bark() {
//        if ("Big".equalsIgnoreCase(size)){
//            System.out.println("WOF-WOf");
//        }else if("Average".equalsIgnoreCase(size)){
//            System.out.println("Waf-waf");
//        }else {
//            System.out.println("Tyau-Tyau");
//        }
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("WOF-WOF");
                break;
            case AVERAGE:
                System.out.println("Waf-waf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tyau-Tyau");
                break;
            default:
                System.out.println("Размер не определен ");
        }


    }
}
