package org.example;

public class Main {
    public static void main(String[] args) {
//mtd 1 with implementation class
        Inter1 i1=new Inter1Impl();
        i1.print();
   //mtd 2 with anonymous class
        Inter1 i2=new Inter1() {
            @Override
            public void print() {
                System.out.println("Implemented by anonymous class");
            }
        };
        i2.print();

        Inter1 i3=()->System.out.println("Implemented with lambda fn");
        i3.print();
        System.out.println("Hello world!");

        AddtionaInterface a1=(a,b)-> a+b;
        System.out.println(a1.add(4,5));

        stringLength s1=(str)->str.length();
        System.out.println(s1.getLength("Manthan Bansal")+" Length of manthan bansal");
    }
}