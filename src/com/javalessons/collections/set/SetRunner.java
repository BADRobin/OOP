package com.javalessons.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        String[] cars = {"Mini", "Mercedes-benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC",  "Toyota", "Chevrolet"};


//        Set<String> carSet = new HashSet<>(Arrays.asList(cars));
//        Set<String> carSet = new LinkedHashSet<>(Arrays.asList(cars));
        Set<String> carSet = new TreeSet<>(Arrays.asList(cars));

//        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));
//        Set<String> otherCarSet = new LinkedHashSet<>(Arrays.asList(otherCars));
        Set<String> otherCarSet = new TreeSet<>(Arrays.asList(otherCars));

//        Set<String> uniqueCars = new HashSet<>(carSet);
//        Set<String> uniqueCars = new LinkedHashSet<>(carSet);
        Set<String> uniqueCars = new TreeSet<>(carSet);
        uniqueCars.addAll(otherCarSet);
        print(uniqueCars);

    }
    public static void print(Set<String> cars){
        System.out.println(cars);
    }
}
