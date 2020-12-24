package com.javalessons.collections.set;

import java.util.*;

public class SetRunnerV {
    public static void main(String[] args) {

        Set<CarSecond> sixCars = new HashSet<>();
        sixCars.add(new CarSecond("VW", "Golf", 45 ));
        sixCars.add(new CarSecond("Audi", "A3", 60 ));
        sixCars.add(new CarSecond("VW", "Polo", 35 ));
        sixCars.add(new CarSecond("BMW", "Z4", 120 ));
        sixCars.add(new CarSecond("BMW", "44i", 200 ));

        Set<CarSecond> euroCars = new HashSet<>();
        euroCars.add(new CarSecond("Toyota", "Auris", 40 ));
        euroCars.add(new CarSecond("Reno", "Clio", 30 ));
        euroCars.add(new CarSecond("Reno", "Megan", 50 ));
        euroCars.add(new CarSecond("VW", "Golf", 45 ));
        euroCars.add(new CarSecond("VW", "Polo", 35 ));

        NavigableSet<CarSecond> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(euroCars);
//        SortedSet<CarSecond> cars = uniqueCars.headSet(new CarSecond("Toyota", "Auris", 40));
//        SortedSet<CarSecond> cars = uniqueCars.tailSet(new CarSecond("Toyota", "Auris", 40));
        SortedSet<CarSecond> cars = uniqueCars.subSet(new CarSecond("Toyota", "Auris", 40), true,
                                                      new CarSecond("Audi", "A3", 60), true);


//        print(cars);
        print(uniqueCars);
        System.out.println(" ");
        System.out.println("Higher");
        System.out.println(uniqueCars.higher(new CarSecond("Toyota", "Auris", 40)));
        System.out.println("Lower");
        System.out.println(uniqueCars.lower(new CarSecond("Toyota", "Auris", 40)));
        System.out.println("Ceiling");
        System.out.println(uniqueCars.ceiling(new CarSecond("Toyota", "Auris", 43)));
        System.out.println("Floor");
        System.out.println(uniqueCars.floor(new CarSecond("Toyota", "Auris", 39)));


    }
    public static void print(Set<CarSecond> cars){
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per Day");
        for (CarSecond carSecond: cars){
            System.out.printf("%-20s %-20s %-20s \n", carSecond.getCarBrand(), carSecond.getModel(), carSecond.getPricePerDay());
        }
    }
}

