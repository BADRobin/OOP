package com.company.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

//    �������� ����������
    private List<String> toDoList = new ArrayList<>();

//  ��������� �����|������� � List
    public void addToList(String task) {
        toDoList.add(task);
    }

//  ��������� �����|������� � ������������ �����(�������)  � List
    public void addToListAtPosition(int position, String task) {
        toDoList.add(position, task);
    }

//  �������������(�������) ��� �������� ������
    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

//  �������� ��������� ���������� (������ ����������)
    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

//  �������  ������/���������� (������) �� ������
    public void removeTask(String task) {
        toDoList.remove(task);
    }

//  ������� ������/�������� ������������ ������
    public void getTaskPriority(String task) {
        toDoList.indexOf(task);
    }
}
