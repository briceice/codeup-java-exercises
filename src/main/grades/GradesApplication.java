package main.grades;

import main.util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Ben = new Student("Ben");
        Ben.addGrade(99);
        Ben.addGrade(95);
        Ben.addGrade(92);
        Ben.recordAttendance("1-1-2022", "P");
        Ben.recordAttendance("1-2-2022", "A");
        Ben.recordAttendance("1-3-2022", "P");
        Ben.recordAttendance("1-4-2022", "P");
        Student Max = new Student("Max");
        Max.addGrade(85);
        Max.addGrade(95);
        Max.addGrade(82);
        Max.recordAttendance("1-1-2022", "P");
        Max.recordAttendance("1-2-2022", "P");
        Max.recordAttendance("1-3-2022", "P");
        Max.recordAttendance("1-4-2022", "P");
        Student Joe = new Student("Joe");
        Joe.addGrade(80);
        Joe.addGrade(80);
        Joe.addGrade(90);
        Joe.recordAttendance("1-1-2022", "P");
        Joe.recordAttendance("1-2-2022", "A");
        Joe.recordAttendance("1-3-2022", "A");
        Joe.recordAttendance("1-4-2022", "P");
        students.put("TheBucket", Ben);
        students.put("Gitter", Max);
        students.put("JDirt", Joe);

        Input input = new Input();

        // show students list
        displayStudents(students);
        System.out.println();
        do {
            // ask for student username
            usernameRequest(input, students);
        } while (repeatRequest(input));
        System.out.println("Goodbye, and have a wonderful day!");
    }
    private static void displayStudents(HashMap<String, Student> hashMap){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n");
        System.out.println(hashMap.keySet());
    }
    private static void usernameRequest(Input input, HashMap<String, Student> hashMap){
        String userInput = input.getString("What student would you like to see more information on?");
        if (hashMap.containsKey(userInput)){
            displayStudentInfo(userInput, hashMap);
            System.out.println();
        } else if (userInput.equalsIgnoreCase("all")){
            displayAllStudentInfo(hashMap);
            System.out.println();
            requestCSV(input, hashMap);
            System.out.println();
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".\n");
        }
    }

    private static void displayStudentInfo(String gitUsername, HashMap<String, Student> hashMap) {
        String studentName = hashMap.get(gitUsername).getName();
        double studentAverage = hashMap.get(gitUsername).getGradeAverage();
        System.out.printf("Name: %s - GitHub Username: %s\n" +
                "Current Average: %.2f\n", studentName, gitUsername, studentAverage);
        System.out.println("Current Grades: " + hashMap.get(gitUsername).getGrades());
        System.out.printf("Attendance: %.2f\n",hashMap.get(gitUsername).getAttendance());
    }

    private static void displayAllStudentInfo(HashMap<String, Student> hashMap){
        double classTotal = 0.0;
        int count = 0;
        for (Student student : hashMap.values()){
            classTotal += student.getGradeAverage();
            count++;
        }
        double classAverage = classTotal/count;
        System.out.printf("Class Average: %.2f", classAverage);
    }

    private static void requestCSV(Input input, HashMap<String, Student> hashMap) {
        boolean userInput = input.yesNo("Print csv report?");
        if (userInput){
            printCSV(hashMap);
        }
    }

    private static void printCSV(HashMap<String, Student> hashMap) {
        System.out.println("name,github_username,average");
        ArrayList<String> studentUsernames = new ArrayList<>();
        int count = 0;
        for (String student : hashMap.keySet()){
            studentUsernames.add(String.valueOf(student));
        }
        for (Student student : hashMap.values()){
            System.out.printf("%s,%s,%.2f\n",student.getName(),studentUsernames.get(count),student.getGradeAverage());
            count++;
        }
    }

    private static boolean repeatRequest(Input input){
        return input.yesNo("Would you like to see another student?");
    }
}
