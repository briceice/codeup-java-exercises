package main.grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // returns the student's grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum/grades.size();
    }
    // attendance recording
    public void recordAttendance(String date, String value){
        if (value.equals("A") || value.equals("P")){
            attendance.put(date, value);
        }
    }
    // calculate attendance
    public double getAttendance(){
        int totalDays = attendance.size();
        int absences = 0;
        for (String attendance : attendance.values()){
            if (attendance.equals("A")){
                absences++;
            }
        }
        return ((double)(totalDays - absences)/totalDays) * 100;
    }
    // find absent days
//    public ArrayList<String> getAbsences(){
//        ArrayList<String> absences = new ArrayList<>();
//        ArrayList<String> dates = (ArrayList<String>) this.attendance.keySet();
//        ArrayList<String> attendance = (ArrayList<String>) this.attendance.values();
//        for (int i = 0; i < attendance.size(); i++) {
//            if (attendance.get(i).equals("A")){
//                absences.add(dates.get(i));
//            }
//        }
//        return absences;
//    }
    // toString override to sout the object
    @Override
    public String toString(){
        return String.format("Name: %s", name);
    }


    public static void main(String[] args) {
        Student Bob = new Student("Bob");
        Bob.addGrade(90);
        Bob.addGrade(95);
        Bob.addGrade(100);
        System.out.println(Bob.getGradeAverage());
        Bob.recordAttendance("1-1-2022", "P");
        Bob.recordAttendance("1-2-2022", "A");
        Bob.recordAttendance("1-3-2022", "A");
        Bob.recordAttendance("1-4-2022", "P");
        System.out.println(Bob.getAttendance());
//        System.out.println(Bob.getAbsences());
        System.out.println(Bob);
    }
}
