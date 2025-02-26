package org.example;

public class Student {
     int x=786;

     @Override
     public boolean equals(Object obj) {
          Student temp=(Student) obj;
          return this.x==temp.x;
//        return this.x==((Student) obj).x;===typecasted and then taking value of x from that
     }
}
