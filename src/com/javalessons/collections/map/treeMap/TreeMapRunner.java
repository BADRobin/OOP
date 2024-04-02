package com.javalessons.collections.map.treeMap;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrades();
        printGrades(grades, false);
//        printGrades(grades, true);
        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade("", 80));
//        SortedMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudents = grades.headMap(border);
//        SortedMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudents = grades.tailMap(border);
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudents = (NavigableMap<AverageStudentGrade, Set<SubjectGrade>>) grades.tailMap(border);
        System.out.println("========================================");
        System.out.println("Scholarship Students");
//        printGrades(scholarshipStudents, false);
        printGrades(scholarshipStudents.descendingMap(), false);
        System.out.println("========================================");
        System.out.println("Contender student");
        AverageStudentGrade contender = grades.lowerKey(border);
        System.out.println(contender);
        System.out.println("========================================");
        System.out.println("Highest grate student");
        System.out.println(scholarshipStudents.descendingMap().firstEntry() );
    }
    private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue){
        Set<AverageStudentGrade> averageGrades = grades.keySet();
        for (AverageStudentGrade gr : averageGrades){
            System.out.println(gr);
            if (printValue){
                System.out.println(grades.get(gr));
            }
        }
    }
    public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades(){
        Set<SubjectGrade> olehGrade = new HashSet<>();
        olehGrade.add(new SubjectGrade("Math",  89));
        olehGrade.add(new SubjectGrade("Physic",  82));
        olehGrade.add(new SubjectGrade("History",  95));
        olehGrade.add(new SubjectGrade("Literature",  79));
        olehGrade.add(new SubjectGrade("Chemistry",  89));

        Set<SubjectGrade> jamesGrade = new HashSet<>();
        jamesGrade.add(new SubjectGrade("Math",  75));
        jamesGrade.add(new SubjectGrade("Physic",  80));
        jamesGrade.add(new SubjectGrade("History",  55));
        jamesGrade.add(new SubjectGrade("Literature",  70));
        jamesGrade.add(new SubjectGrade("Chemistry",  80));

        Set<SubjectGrade> antonyGrade = new HashSet<>();
        antonyGrade.add(new SubjectGrade("Math",  93));
        antonyGrade.add(new SubjectGrade("Physic",  91));
        antonyGrade.add(new SubjectGrade("History",  92));
        antonyGrade.add(new SubjectGrade("Literature",  78));
        antonyGrade.add(new SubjectGrade("Chemistry",  78));

        Set<SubjectGrade> viktoriaGrade = new HashSet<>();
        viktoriaGrade.add(new SubjectGrade("Math",  73));
        viktoriaGrade.add(new SubjectGrade("Physic",  65));
        viktoriaGrade.add(new SubjectGrade("History",  75));
        viktoriaGrade.add(new SubjectGrade("Literature",  66));
        viktoriaGrade.add(new SubjectGrade("Chemistry",  50));

        Set<SubjectGrade> alinaGrade = new HashSet<>();
        alinaGrade.add(new SubjectGrade("Math",  90));
        alinaGrade.add(new SubjectGrade("Physic",  70));
        alinaGrade.add(new SubjectGrade("History",  78));
        alinaGrade.add(new SubjectGrade("Literature",  88));
        alinaGrade.add(new SubjectGrade("Chemistry",  89));

        NavigableMap<AverageStudentGrade, Set<SubjectGrade >> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Oleh", calcAverage(olehGrade) ), olehGrade);
        map.put(new AverageStudentGrade("James", calcAverage(jamesGrade) ), jamesGrade);
        map.put(new AverageStudentGrade("Antony", calcAverage(antonyGrade) ), antonyGrade);
        map.put(new AverageStudentGrade("Viktoria", calcAverage(viktoriaGrade) ), viktoriaGrade);
        map.put(new AverageStudentGrade("Alina", calcAverage(alinaGrade) ), alinaGrade);
        return map;
    }
    private static float calcAverage(Set<SubjectGrade> grades){
        float sum = 0f;
        for (SubjectGrade sg: grades){
            sum += sg.getGrade();
        }
        return sum/grades.size();
    }
}
