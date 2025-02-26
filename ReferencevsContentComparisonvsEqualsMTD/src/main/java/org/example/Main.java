package org.example;

public class Main {
    public static void main(String[] args) {


        Student s1=new Student();
        Student s2=new Student();
        System.out.println("Hello world!");
        System.out.println("Hello!"+s1.hashCode()+" ddhfg"+s2.hashCode());
        System.out.println(s1==s2);
        System.out.println( s1.equals(s2));
//        s1.x=3;
        System.out.println( s1.x==s2.x);
        System.out.println( s1.equals(s2));

    }
}