package com.company.domainmodel;

public class Employee {

    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    static {
        id = 1001;
        System.out.println("Вызвали static INIT блок ");
    }

    {
        department = "IT";
        System.out.println("Вызвали NON-static INIT блок ");
    }


    public Employee() {
        this("A", "B", 5);
        System.out.println("Вызываем постой Конструктор ");
    }

    public Employee(String name, String position, int salary) {

        this(name, position, salary, "IT");
        System.out.println("Вызываем Конструктор с тремя параметрами");
    }

    private Employee(String name, String position, int salary, String department) {
        employeeId = id ++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Вызываем Конструктор с четырьмя параметрами");

    }

    public int getEmployeeId() {
        return employeeId;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
