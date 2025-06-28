package org.lessons.java.snack;

public class Register {
    private Students[] students;
    private int studentsIndex;

    Register() {
        this.students = new Students[0];
        this.studentsIndex = 0;
    }

    // GETTER

    public Students[] getStudents() {
        return students;
    }

    // UTILITY

    public void addStudent(Students student) {
        Students[] newArray = new Students[studentsIndex + 1];

        for (int i = 0; i < studentsIndex; i++) {
            newArray[i] = students[i];
        }

        newArray[studentsIndex] = student;

        students = newArray;
        studentsIndex++;
    }

    public void showStudents() {
        for (int i = 0; i < this.students.length; i++) {
            System.out.println(students[i].getFullName());
        }
    }
}
