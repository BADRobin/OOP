package com.javalessons.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunnerF {
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

        Set<CarSecond> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(euroCars);

        print(uniqueCars);



    }
    public static void print(Set<CarSecond> cars){
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per Day");
        for (CarSecond carSecond: cars){
            System.out.printf("%-20s %-20s %-20s \n", carSecond.getCarBrand(), carSecond.getModel(), carSecond.getPricePerDay());
        }
    }
}

