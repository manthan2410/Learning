package org.example;

import java.util.ArrayList;
import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> names= List.of("Manthan","Pritish","Steven");

        //filter
        List<String> p = names.stream().filter(e -> e.startsWith("P")).toList();
        System.out.println(p+"filter");


        //map and foreach
        List<Integer> num=List.of(1,4,3,6);
        num.stream().map(e->e*e).forEach(m->System.out.print(m+"map"));

         System.out.println("********************************");
        //sorted;
        num.stream().sorted().forEach(m->System.out.print(m));

        System.out.println("********************************");
      Integer m=  num.stream().min((x,y)->x.compareTo(y)).get();
      System.out.println(m+"min");
        Integer t=  num.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(t+"max");
    }
}
