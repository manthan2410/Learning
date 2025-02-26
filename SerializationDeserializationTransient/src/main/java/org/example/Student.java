package org.example;

import java.io.Serializable;

public class Student implements Serializable
{
    private String name;
    private int age;
    private String email;
  transient  private String address;

    public Student(int age, String name, String email, String address) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display()
    {
        System.out.println("object is created");
    }
}
