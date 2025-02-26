package org.example;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setAge(23).setCity("kln").setName("Manthan");

        System.out.println("Hello world!"+s);


        StudentWithBuilderPattern s2=StudentWithBuilderPattern.of().setAge(2).setCity("Sangat").setName("Pritish");

        System.out.println("Hello world! with builder pattern"+s2);
    }
}