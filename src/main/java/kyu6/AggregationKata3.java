package kyu6;//Java 8 has introduced a sexy new Stream API which makes it possible to solve some data related problems in just a few lines of code. Let's try it out!
//
//You have a Student class (see the class declaration below).
//
//You have an array of students and you want to get some aggregate data.
//
//THE TASK: get the names of the students by department.
//
//Implement the method using Java 8 Stream API.
//
//Have Fun!


import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class AggregationKata3 {

    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student3> students) {

        return students.collect(groupingBy(Student3::getDepartment, mapping(Student3::getName, toList())));

    }
}


class Student3 {
    private String name;
    private double grade;
    private String department;
    private Gender gender;

    public static final double PASSING_GRADE = 70.0;

    public enum Gender {
        MALE, FEMALE
    }

    public Student3 (String name, double grade, String department, Gender gender) {
        this.name = name;
        this.grade = grade;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}