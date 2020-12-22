package com.javalessons.firststep.controlstatement;

public class DoWhile {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int payment = 1000;
        int month = 0;
        double interestRate = 0.006;

//        while (currentBalance < finalBalance){
//            currentBalance += payment;
//            currentBalance = currentBalance + currentBalance* interestRate;
//            years ++;
//            System.out.println("Years " + years+ " - " + currentBalance);
//        }
        do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            month++;
            System.out.println("Month " + month + " - " + currentBalance);
        } while (currentBalance < finalBalance && month <24);
    }
}
