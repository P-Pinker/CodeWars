package kyu6;//Tale University is a bit messy, and can't maintain an ordered list of their student. Tale's dean wants to print a sortet list of his students by the gpa, last name and age and post it on the walls so everybody can be impressed of his great students.
//
//Given a list of students, sort them by (from most important to least important):
//
//GPA (descending)
//First letter of last name (ascending)
//Age (ascending)
//
//And the class Student:
//
//class Student {
//...
//int getGpa()
//int getAge();
//String getFullName();
//}
//
//Return the sorted result as full names string, comma separated.
//
//For Example, given the list (name, age, gpa):
//
//David Goodman, 23, 88
//Mark Rose, 25, 82
//Jane Doe, 22, 90
//Jane Dane, 25, 90
//
//sort(students) should return "Jane Doe,Jane Dane,David Goodman,Mark Rose"


import java.util.List;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.joining;


public class TripleSorter {

    public static String sort(List<StudentTS> students) {
        return students.stream()
                .sorted(comparingInt(StudentTS::getGpa).reversed()
                        .thenComparing(s -> s.getFullName().split(" ")[1].charAt(0))
                        .thenComparingInt(StudentTS::getAge))
                .map(StudentTS::getFullName)
                .collect(joining(","));
    }
}

abstract class StudentTS {

abstract int getGpa();
abstract int getAge();
abstract String getFullName();

}