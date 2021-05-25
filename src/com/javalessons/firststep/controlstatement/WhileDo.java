package com.javalessons.firststep.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 1000000;
        double currentBalance = 5000;
        int payment = 12000;
        int years = 0;
        double interestRate = 0.08;

//        while (currentBalance < finalBalance){
//            currentBalance += payment;
//            currentBalance = currentBalance + currentBalance* interestRate;
//            years ++;
//            System.out.println("Years " + years+ " - " + currentBalance);
//        }
        do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Years " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance && years <100);
    }
}
