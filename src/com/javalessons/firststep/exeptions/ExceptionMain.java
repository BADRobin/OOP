package com.javalessons.firststep.exeptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
//
//        try {
//            doEverything();
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
////            e.printStackTrace();
//            System.out.println("------------------------");
//            Throwable[] suppressed = e.getSuppressed();
//            System.out.println(suppressed[0]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }

    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
//        PrintWriter printWriter = null;
        boolean continueLoop = true;
        do {
            try (PrintWriter printWriter = new PrintWriter(new FileWriter("out.txt")); BufferedReader reader = new BufferedReader(new FileReader("1234"))){
                System.out.println("������� ����� numerator");
                int numerator = scanner.nextInt();
                System.out.println("������� ����� denominator");
                int denominator = scanner.nextInt();
//                System.out.println("����� " + devide(numerator, denominator));
//                saveToFile();
//                if (continueLoop) {
//                    throw new RuntimeException("RuntimeException");
//                }
//                int[] intArray = new int[1];
//                int i = intArray[2];
                continueLoop = false;
//                printWriter = new PrintWriter(new FileWriter("out.txt"));
                printWriter.println("��������� = " + devide(numerator, denominator));

            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("����������: " + e);
                scanner.nextLine();
                System.out.println("������ �� ������� ��������� � ������ �����");
//            e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e){
                System.out.println("All Exception");
                throw new InvalidInputParamException("Array Index Out Of Bounds " + e);

            }
            finally {
                System.out.println("Finally");
//                if (printWriter != null) {
//                    printWriter.close();
//                }
            }

            System.out.println("Try / catch ���� ��������");
        } while (continueLoop);
    }

    private static int devide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

}
