package com.company.list;

import java.util.ArrayList;

public class ToDoList {

//    Создание переменной
    private ArrayList<String> toDoList = new ArrayList<>();

//  Добавляет метод|элемент в List
    public void addToList(String task) {
        toDoList.add(task);
    }

//  Добавляет метод|элемент в определенное место(позицию)  в List
    public void addToListAtPosition(int position, String task) {
        toDoList.add(position, task);
    }

//  Распечатывает(выводит) все элементы списка
    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

//  Изменяет указанную переменную (индекс переменной)
    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

//  Убирает  задачу/переменную (индекс) из списка
    public void removeTask(String task) {
        toDoList.remove(task);
    }

//  Получет индекс/значение определенной задачи
    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }
}
