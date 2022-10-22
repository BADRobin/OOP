package com.javalessons.collections.map.hashMap;

import com.javalessons.collections.set.CarSecond;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLauncher {
    public static void main(String[] args) {
//        Map<CarSecond, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new HashMap<>();

//        numbers.put("One", 1);
//        numbers.put(new CarSecond("Toyota", "Corolla", 50), 50);
//        numbers.put(new CarSecond("Audi", "A5", 50), 51);
//        numbers.put(new CarSecond("Toyota", "Auris", 50), 52);
        numbers.put("Toyota", 50);
        numbers.put("Audi", 51);
        System.out.println(numbers.put("Toyota", 52));
//        Произойдет перезапись
//        numbers.put("One", 2);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);


//        System.out.println(numbers.get(new CarSecond("Audi", "A5", 50)));

    }
}
