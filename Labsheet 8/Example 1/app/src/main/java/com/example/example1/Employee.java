package com.example.example1;

public class Employee {
    private int id;
    private String name;
    private String dep;
    private String salary;

    public Employee(int id, String name, String dep, String salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public Employee(String name, String dep, String salary) {
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public String getSalary() {
        return salary;
    }
}
