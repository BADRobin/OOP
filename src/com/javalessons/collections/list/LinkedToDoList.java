package com.javalessons.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedToDoList {
//        �������� ����������
    private LinkedList<String> linkedToDoList = new LinkedList<>();

    //  ��������� �����|������� � List
    public void addToList(String task) {
//        linkedToDoList.add(task);
        addInAlphabeticalOrder(task);
    }
private boolean addInAlphabeticalOrder(String task){
    ListIterator<String> listIter = linkedToDoList.listIterator();
    while (listIter.hasNext()){
        int compared = listIter.next().compareTo(task);
        if (compared == 0){
            System.out.println("��� ���� � ������");
            return true;
        } else if (compared >0){
            listIter.previous();
            listIter.add(task);
            return true;
        }
//        else {
//            listIter.add(task);
//            linkedToDoList.add(task);
//
//        }

    }
    linkedToDoList.add(task);
    return true;
}
    //  ��������� �����|������� � ������������ �����(�������)  � List
    public void addToListAtPosition(int position, String task) {
        linkedToDoList.add(position, task);
    }

    //  �������������(�������) ��� �������� ������
    public void printToDoList() {
//        for (int i = 0; i < linkedToDoList.size(); i++) {
//            System.out.println(i + " - " + linkedToDoList.get(i));
//        }
        Iterator<String> iterator = linkedToDoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element - " + iterator.next() );
        }
    }

    //  �������� ��������� ���������� (������ ����������)
    public void changeTask(int index, String task) {
        linkedToDoList.set(index, task);
    }

    //  �������  ������/���������� (������) �� ������
    public void removeTask(String task) {
        linkedToDoList.remove(task);
        linkedToDoList.iterator();
    }

    //  ������� ������/�������� ������������ ������
    public int getTaskPriority(String task) {
        return linkedToDoList.indexOf(task);
    }
}
