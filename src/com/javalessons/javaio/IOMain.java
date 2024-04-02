package com.javalessons.javaio;

import com.javalessons.collections.map.treeMap.AverageStudentGrade;
import com.javalessons.collections.map.treeMap.SubjectGrade;
import com.javalessons.collections.map.treeMap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {

    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        try {
            FileWriter writer = new FileWriter("GradeBook");
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("-----------------------------\n");
                writer.write("Student: " + gradeKey.getName() + " Average Grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {

                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
