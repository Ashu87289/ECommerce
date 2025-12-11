package com.ashu.Java8Streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int age;
    private String gender;
    private int salary;

    public Employee(int id, String name, int age, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"John",30,"Male",50000));
        list.add(new Employee(2,"Jane Smith",25,"Female",20000));
        list.add(new Employee(3,"Mike",40,"Male",70000));
        list.add(new Employee(4,"Emily",35,"Female",80000));
        list.add(new Employee(5,"Robert",50,"Male",90000));


        Map<String, Long> genderCount = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println(genderCount);

        Map<String, Double> averageSalay = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(averageSalay);

        int n = 4;
        Integer highestSalary = list.stream().map(Employee::getSalary)
                .sorted()
                .skip(n-1)
                .findFirst()
                .orElseThrow();

        //System.out.println(highestSalary);

        Integer nthAge = list.stream()
                        .map(Employee::getAge)
                                .sorted().skip(n-1)
                        .findFirst().orElseThrow();

        System.out.println(nthAge);


        //Sort Employee by Age, Name and salary using comparator and lambda
        List<Employee> sortByAge = list.stream().sorted(Comparator.comparing(Employee::getAge).
                thenComparing(Employee::getName).thenComparing(Employee::getSalary)).collect(
                Collectors.toList());

        System.out.println(sortByAge);

        //Find highest-paid employee of each gender

        Map<String, Optional<Employee>> highestPaidBygender = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(
                        Comparator.comparing(Employee::getSalary)
                )));

        System.out.println(highestPaidBygender);
    }
}
