package kyu6;//Java 8 has introduced a sexy new Stream API which makes it possible to solve some data related problems in just a few lines of code. Let's try it out!
//
//You have a Student class (see the class declaration below).
//
//You have an array of students and you want to get some aggregate data.
//
//THE TASK: get the the number of students by gender for each department. (i.e. "CS" department has 2 males, 3 females, "Economics" department has 4 males, 5 females, etc.)
//
//Implement the method using Java 8 Stream API.
//
//Have Fun!


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata4 {

    public static Map<String, Map<Student4.Gender, Long>>
        getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student4> students) {

        return students.collect(
                Collectors.groupingBy(Student4::getDepartment,
                        Collectors.groupingBy(Student4::getGender, Collectors.counting())));

    }
}


class Student4 {
    private String name;
    private double grade;
    private String department;
    private Gender gender;

    public static final double PASSING_GRADE = 70.0;

    public enum Gender {
        MALE, FEMALE
    }

    public Student4 (String name, double grade, String department, Gender gender) {
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