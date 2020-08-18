package com.company.arrays;

import java.util.Scanner;

public class ArraySort {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int myArray[] = new int[8];
        int myArray[] = {0,1,25,11,27,28,600,44,14,2};

//        System.out.println("¬вудите 8 Їлементов");
//        for (int j = 0; j < myArray.length; j++) {
//            System.out.println("—ледующий элемент: ");
//            myArray[j] = scanner.nextInt();
//
//        }
        int [] array = sort(myArray);
//        for (int i = 0; i < myArray.length; i++) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "= " + myArray[i]);
        }
    }

    private static int[] sort(int[] array) {
//        int[] myNewArray = new int[array.length];
//        for (int i=0; i< array.length; i++){
//            myNewArray[i] = array[i];
//     }
//        int[] myNewArray =

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }return array;
    }
}


