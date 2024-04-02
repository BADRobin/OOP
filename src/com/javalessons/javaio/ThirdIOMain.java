package com.javalessons.javaio;

import com.javalessons.collections.map.treeMap.AverageStudentGrade;
import com.javalessons.collections.map.treeMap.SubjectGrade;
import com.javalessons.collections.map.treeMap.TreeMapRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class ThirdIOMain {
    private static final String FILE_NAME = "GradeBook.txt";

    public static void main(String[] args) throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        readFile(grades);

//        FileReader reader = new FileReader(FILE_NAME);
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
//        Only for FileReader
//        int c;
//        while ((c = reader.read()) != -1) {
//            System.out.println(c);
//        }
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }

    private static void readFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

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

