package com.DaliyCodeBuffer;

public class Student {
    private String name;
    private long id;
    private String email;
    private float gpa;

    public Student(String name, long id, String email, float gpa) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
