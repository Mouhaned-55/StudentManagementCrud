package com.example.studentmanagmentcrud;


import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private final List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    // Create
    public void addStudent(int id, String name, int age) {
        Student student = new Student(id, name, age);
        students.add(student);
    }

    // Read
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        System.out.println("No user found");
        return null;
    }


    // Update
    public void updateStudent(int id, String newName, int newAge) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Student with id " + id + " not found");
        }
    }

    // Delete
    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student with id " + id + " not found");
        }
    }
}
