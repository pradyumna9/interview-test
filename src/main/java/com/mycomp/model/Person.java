package com.mycomp.model;

public class Person implements Comparable{
    private String name;
    private String id;
    private float salary;

    public Person(String name, String id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
       Person p = (Person) o;
       Person p1 = this;
        return -p.getName().compareTo(p1.getName());
    }
}
