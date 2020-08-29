package com.javalessons.collections.list;

import java.util.Scanner;

public class ListRunner {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] array = new int[5];
//        for (int i = 0; i < args.length; i++) {
//            array[i] = i * 2;
//        }
//
////        неудобен, не гибкий
//        int[] nArray = new int[10];
//        System.arraycopy(array, 0, nArray, 0, array.length);
//        nArray[6] = 100;
//        System.out.println(Arrays.toString(nArray));


//        ToDoList list = new ToDoList();
        LinkedToDoList list = new LinkedToDoList();

        printOut();
        int param = scanner.nextInt();
        while (param != 0){
            switch (param){
                case 1:
                    System.out.println("Please enter a task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Printing out toDoList");
                    list.printToDoList();
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Please enter an item to update");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Plese enter a task to remove ");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    list.removeTask(task4);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Please enter the task ro ger priority ");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    System.out.println("Priority of the task is: " + list.getTaskPriority(task5));

                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Plese enter a number of position for the task");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("Please enter a new task ");
                    scanner.nextLine();
                    String task6 = scanner.nextLine();
                    list.addToListAtPosition(index, task6);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }
    }
    private static void printOut(){
        System.out.println("Please choose an action. Press :\n"+
                "1 to Add a new item into toDoList\n" +
                "2 to print out the list \n" +
                "3 to update an existing item \n" +
                "4 to remove an item from the list \n" +
                "5 to get task priority or number in the list \n" +
                "6 to add a new item in the specific position \n" +
                "press 0 foe exit \n" +
                "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER ");

    }

}
