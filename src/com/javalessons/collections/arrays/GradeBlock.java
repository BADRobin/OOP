package com.javalessons.collections.arrays;

import java.util.Arrays;

public class GradeBlock {
    public static void main(String[] args) {
//Поиск и вывод самого минимального значения
        int[][] gradesArray = {{87, 54, 84},
                {54, 102, 154},
                {14, 22, 552},
                {254, 78, 141},
                {444, 997, 144},
                {14, 5, 366},
                {25, 88, 55},
                {74, 3, 656},
                {252, 77, 788},
                {255, 825, 12}};
        System.out.println("Минимальное значение " + calcMin(gradesArray));
        System.out.println();
        varArgs();
        System.out.println();
        processArrays();
    }

    private static int calcMin(int[][] grates) {
        int min = 100;
        for (int[] row : grates) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

    private static void varArgs() {
        double a = 0.56;
        double b = 1.92;
        double c = 3.45;
        double d = 5.01;
        System.out.println("Average of 2 elements is " + calcAverage(a, b));
        System.out.println("Average of 3 elements is " + calcAverage(a, b, c));
        System.out.println("Average of 4 elements is " + calcAverage(a, b, c, d));
    }

    private static double calcAverage(double... args) {
        double sum = 0;
        for (double i : args) {
            sum = sum + i;
        }
        return sum / args.length;
    }

    private static void processArrays(){
        double[] doubleArray = {8.9, 2.44,1.25,0.14,5.14};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1,2,3,4,5,6,7};
        int[] arrayCopy= new int[10];

        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        System.out.println(Arrays.toString(arrayCopy));
    }
}
