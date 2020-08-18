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
        System.out.println("������� static INIT ���� ");
    }

    {
        department = "IT";
        System.out.println("������� NON-static INIT ���� ");
    }


    public Employee() {
        this("A", "B", 5);
        System.out.println("�������� ������ ����������� ");
    }

    public Employee(String name, String position, int salary) {

        this(name, position, salary, "IT");
        System.out.println("�������� ����������� � ����� �����������");
    }

    private Employee(String name, String position, int salary, String department) {
        employeeId = id ++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("�������� ����������� � �������� �����������");

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
