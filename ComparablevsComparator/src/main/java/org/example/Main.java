package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(19);
        numbers.add(6);
        numbers.add(15);
        System.out.println("Hello world!");
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        ArrayList<Employee> emps=new ArrayList<>();
        emps.add(new Employee("manthanmanu@gmail","Manthan",2));
        emps.add(new Employee("sjgklsj@gmail","Pritish",1));
        emps.add(new Employee("dugg@gmail","Hrt",6));
        System.out.println(emps);
        Collections.sort(emps);
        System.out.println(emps);       System.out.println(emps);
        Collections.sort(emps,new IdComparator());
        System.out.println(emps);
        Collections.sort(emps,new emailComparator());
        System.out.println(emps);
    }
}