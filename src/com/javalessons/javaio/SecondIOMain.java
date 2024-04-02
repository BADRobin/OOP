package com.javalessons.javaio;

import com.javalessons.collections.map.treeMap.AverageStudentGrade;
import com.javalessons.collections.map.treeMap.SubjectGrade;
import com.javalessons.collections.map.treeMap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class SecondIOMain {

    public static void main(String[] args) throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        readFile(grades);
    }

    private static void readFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("GradeBook.txt");
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("-----------------------------\n");
                writer.write("Student: " + gradeKey.getName() + "," + " Average Grade: " + gradeKey.getAverageGrade() + " \n");
                for (SubjectGrade grade : grades.get(gradeKey)) {

                    writer.write("Subject: " + grade.getSubject() + "," + " Grade: " + grade.getGrade() + " \n");

                }
            }
        } finally {

            if (writer != null) {
                writer.close();
            }

        }
    }
}

