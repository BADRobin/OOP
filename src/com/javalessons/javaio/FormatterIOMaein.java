package com.javalessons.javaio;

import com.javalessons.collections.map.treeMap.AverageStudentGrade;
import com.javalessons.collections.map.treeMap.SubjectGrade;
import com.javalessons.collections.map.treeMap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class FormatterIOMaein {

    private static final String FILE_NAME = "GradeBook.txt";

    public static void main(String[] args) throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
//        writeFile(grades);
//        readFile();
        Formatter formatter = new Formatter("BankAccount");
        System.out.println("Please enter Client ID, Client Name, Client Surname and account balance");
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            try {


                formatter.format("%d, %s, %s, %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e){
                System.out.println("Input incorrect. Please try again ");
                scanner.nextLine();
            }
        }
        formatter.close();
    }

    private static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }

    private static void writeFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("-----------------------------\n");
                writer.write("Student: " + gradeKey.getName() + "," + " Average Grade: " + gradeKey.getAverageGrade() + " \n");
                for (SubjectGrade grade : grades.get(gradeKey)) {

                    writer.write("Subject: " + grade.getSubject() + "," + " Grade: " + grade.getGrade() + " \n");
                }
            }
        }
    }
}





