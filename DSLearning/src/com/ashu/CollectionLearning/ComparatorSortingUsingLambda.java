package com.ashu.CollectionLearning;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class ComparatorSortingUsingLambda {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Ashu",20000));
        emp.add(new Employee(2,"Vandu",30000));
        emp.add(new Employee(3,"Ramu",25000));
        emp.add(new Employee(4,"Shyamu",40000));

        emp.sort(
                Comparator.comparing(Employee::getName)
                        .thenComparingInt(Employee::getSalary)
                        .thenComparingInt(Employee::getId)
        );

        System.out.println(emp);
    }
}
