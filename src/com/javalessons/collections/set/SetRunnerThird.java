package com.javalessons.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetRunnerThird {
    public static void main(String[] args) {

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45 ));
        sixCars.add(new Car("Audi", "A3", 60 ));
        sixCars.add(new Car("VW", "Polo", 35 ));
        sixCars.add(new Car("BMW", "Z4", 120 ));
        sixCars.add(new Car("BMW", "44i", 200 ));

        Set<Car> euroCars = new HashSet<>();
        euroCars.add(new Car("Toyota", "Auris", 40 ));
        euroCars.add(new Car("Reno", "Clio", 30 ));
        euroCars.add(new Car("Reno", "Megan", 50 ));
        euroCars.add(new Car("VW", "Golf", 45 ));
        euroCars.add(new Car("VW", "Polo", 35 ));

        Set<Car> uniqueCars = new HashSet<>(sixCars);
        uniqueCars.addAll(euroCars);

//        print(uniqueCars);

//        sixCars.removeAll(euroCars);
//        euroCars.removeAll(sixCars);
//        print(sixCars);
//        print(euroCars);
        sixCars.retainAll(euroCars);
//        uniqueCars.removeAll(sixCars);
        print(sixCars);
//        print(uniqueCars);



    }
    public static void print(Set<Car> cars){
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per Day");
        for (Car car: cars){
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
