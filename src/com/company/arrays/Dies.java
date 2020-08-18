package com.company.arrays;

import java.security.SecureRandom;

public class Dies {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }
        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Сторона " + i + " " + frequency[i]);
        }
//        способ получения уже готовый элемент массива
//        for (int i: frequency) {
//            System.out.println("Сторона " + i);
//        }
        multiDimArrayLauncher();
    }

    private static void multiDimArrayLauncher() {
//        arr[0][0], arr[0][1],arr[0][2]
//        arr[1][0], arr[1][1],arr[1][2]
        int[][] a = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        int[][] b = new int[3][3];
        int[][] c = new int[2][];
        c[0] = new int[2];

        for (int i = 0; i< a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
