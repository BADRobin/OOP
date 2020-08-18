package com.company.list;

import java.util.Arrays;

public class ListRunner {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        for (int i = 0; i < args.length; i++) {
//            array[i] = i * 2;
//        }
//
////        неудобен, не гибкий
//        int[] nArray = new int[10];
//        System.arraycopy(array, 0, nArray, 0, array.length);
//        nArray[6] = 100;
//        System.out.println(Arrays.toString(nArray));
    }
    private static void printOut(){
        System.out.println("Please choose an action. Press :\n"+
                "1 to Add a new item into toDoList\n" +
                "2 to print out the list \n" +
                "3 to update an existing item \n" +
                "4 to remove an item from the list \n" +
                "5 to get task priority or number in the list \n" +
                "6 to add a new item in the specific position \n" +
                "press 0 foe exit \n" +
                "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER ");

    }

}
