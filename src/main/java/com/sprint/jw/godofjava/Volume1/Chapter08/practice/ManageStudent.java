package com.sprint.jw.godofjava.Volume1.Chapter08.practice;

public class ManageStudent {
    public static void main(String[] args) {
        Student students[] = null;
        ManageStudent manageStudent = new ManageStudent();
        students = manageStudent.addStudent();
        manageStudent.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "01000000000", "sook@email.com");
        return student;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
