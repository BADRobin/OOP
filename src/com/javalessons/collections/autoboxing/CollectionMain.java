package com.javalessons.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("sdsd");
//        for (int i=0; i<list.size(); i++){
//            Object s = (String) list.get(i);
//        }
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));
        Integer integ = 54;
        int n = integ;

        String[] colors = {"yellow", "blue", "green"} ;
        LinkedList <String> strings =new LinkedList<>(Arrays.asList(colors));
        strings.add("black");
        colors = strings.toArray(new String[strings.size()]);
        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);

        }
    }
}
