package com.ashu.Java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupElementByAge {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ashu",28));
        students.add(new Student(2,"vandu",29));
        students.add(new Student(3,"Shivani",25));
        students.add(new Student(4,"Aryan",18));
        students.add(new Student(5,"Diksha",22));


        Map<Integer,List<Student>> groupByAge = students.stream().collect(Collectors.groupingBy(Student::getAge));

        Map<Integer,Long> countByAge = students.stream().collect(Collectors.groupingBy(
                Student::getAge,Collectors.counting()
        ));

        Map<Integer,List<String>> getName = students.stream().collect(Collectors.groupingBy(
                Student::getAge,Collectors.mapping(Student::getName,Collectors.toList())
        ));

        //System.out.println(groupByAge);
        //System.out.println(countByAge);
        System.out.println(getName);
    }
}
