package main.grades;

import main.util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();
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
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".\n");
        }
    }

    private static void displayStudentInfo(String gitUsername, HashMap<String, Student> hashMap) {
        String studentName = hashMap.get(gitUsername).getName();
        Double studentAverage = hashMap.get(gitUsername).getGradeAverage();
        System.out.printf("Name: %s - GitHub Username: %s\n" +
                "Current Average: %.2f", studentName, gitUsername, studentAverage);
        System.out.println();
    }

    private static boolean repeatRequest(Input input){
        return input.yesNo("Would you like to see another student?");
    }
}
