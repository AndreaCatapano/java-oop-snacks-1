package org.lessons.java.snack;

public class Students {

    private String name;
    private String surname;
    private int age;

    public Students(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // GETTER

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // SETTER

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // UTILITY

    public String getFullName() {
        return name + " " + surname + ", " + age + " anni";
    }

}
