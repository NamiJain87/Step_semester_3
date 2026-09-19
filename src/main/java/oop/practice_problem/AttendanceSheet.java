package main.java.oop.practice_problem;

public class AttendanceSheet {

    private String[] students;
    private int count;

    public AttendanceSheet(int capacity) {
        students = new String[capacity];
        count = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }

        if (count < students.length) {
            students[count] = name;
            count++;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        AttendanceSheet attendance = new AttendanceSheet(5);

        attendance.markPresent("Nami");
        attendance.markPresent("Arun");
        attendance.markPresent("Priya");

        // Duplicate name
        attendance.markPresent("Nami");

        System.out.println("Present Count: " + attendance.getPresentCount());
        System.out.println("Is Nami present? " + attendance.isPresent("Nami"));
        System.out.println("Is Rahul present? " + attendance.isPresent("Rahul"));
    }
}
