package com.example.studentmanagmentcrud;

public class Main {
    public static void main(String[] args) {

        StudentManagement management = new StudentManagement();

        // Add some students
        management.addStudent(1, "Marwen Shili", 26);
        management.addStudent(2, "Mouhaned Akermi", 22);

        // Find and display a student
        Student student = management.findStudentById(1);
        if (student != null) {
            System.out.println("Student found: " + student.getName() + ", Age: " + student.getAge());
        } else {
            System.out.println("Student not found");
        }

        // Update a student
        management.updateStudent(1, "Marwen Sh", 18);

        // Delete a student
        management.deleteStudent(2);

    }
}
