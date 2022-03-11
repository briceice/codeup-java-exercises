package main.grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Ben = new Student("Ben");
        Ben.addGrade(99);
        Ben.addGrade(95);
        Ben.addGrade(92);
        Student Max = new Student("Max");
        Max.addGrade(85);
        Max.addGrade(95);
        Max.addGrade(82);
        Student Joe = new Student("Joe");
        Joe.addGrade(80);
        Joe.addGrade(80);
        Joe.addGrade(90);
        students.put("TheBucket", Ben);
        students.put("Gitter", Max);
        students.put("Dirt", Joe);
    }
}
