package com.example.exercise;

public class Student {
    private int id;
    private String name;
    private String age;
    private String address;
    private String dep;

    public Student(int id, String name, String age, String address, String dep) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dep = dep;
    }

    public Student(String name, String age, String address, String dep) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.dep = dep;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDep() {
        return dep;
    }
}
