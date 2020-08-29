package com.javalessons.collections.arrays;

import java.util.Scanner;

public class ArrayLauncher {
private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myArray = new int[10];
//        myArray[0] = 0;
//        myArray[1] = 100;
//        myArray[2] = 200;
//        myArray[3] = 300;
//        myArray[4] = 400;
//        myArray[5] = 500;
//        myArray[9] = 900;
//        int myArray[] = {0,100,200,300,400,500,600,700,800,900};
        System.out.println("¬вудите 8 Їлементов");
        int myArray[] = new  int [8];
        for (int j=0; j< myArray.length; j++){
            System.out.println("—ледующий элемент: ");
            myArray[j] = scanner.nextInt();

        }
//        for (int i=0; i<6; i++) {
        for (int i=0; i<myArray.length; i++) {
            System.out.println("Element " + i + "= " +  myArray[i]);
        }
    }
}
