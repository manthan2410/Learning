package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(62);
        System.out.println(list1);
        //without stream
        List<Integer> list2=new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0)
            {
                list2.add(i);
            }
        }
       System.out.println(list2);

        //with stream
     List<Integer> list3=   list1.stream().filter(i->i%2==0).collect(Collectors.toList());
     System.out.println(list3+"with stream api");

     //get all nos greater than 50
        List<Integer> list4=list1.stream().filter(i->i>50).toList();
        System.out.println(list4+"with stream api");
    }
}