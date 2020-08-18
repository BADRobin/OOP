package com.company.oop;

import com.company.oop.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println("Количество собак - " + Dog.getDogsCount());

        Dog lab = new Dog();
//        lab.setPaws(4);
//        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Lab");
//        lab.setSize("Average");
        lab.setSize(Size.AVERAGE);
        lab.bite();


        Dog sheppard = new Dog();
//        sheppard.setPaws(4);
//        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Shepard");
//        sheppard.setSize("Big");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
//        doberman.setPaws(4);
//        doberman.setTail(1);
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
//        doberman.setSize("Big");
        doberman.setSize(Size.BIG);
        doberman.bite();


//        System.out.println(lab.getBreed()+"'s name " + lab.getName());
//        System.out.println(sheppard.getBreed() + "'s name " + sheppard.getName());
//        System.out.println(doberman.getBreed() + "'s name " + doberman.getName());

        Size s = Size.SMALL;
//        System.out.println(s);
//        Size s1 = Size.valueOf("BIG");

        Size[] values = Size.values();
        for (int i = 0; i<values.length; i++)
        System.out.println(values[i]);

    }
//    public enum Size {
//        BIG, AVERAGE, SMALL
//    }

}
