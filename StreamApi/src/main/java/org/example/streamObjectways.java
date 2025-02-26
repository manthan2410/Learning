package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamObjectways {
    public static void main(String[] args) {
        List<Integer> l1=List.of(4,5,7,20);

        //to get objects of stream
        //1.with empty() mtd of stream Interface
        Stream<Object> s1=Stream.empty();
        s1.forEach(e->{
            System.out.println(e);
        });

        //2.with of() of Stream interface
        Stream<String> s2=Stream.of("Manthan","text","dh");
        s2.forEach(s->{
            System.out.println(s);
        });

        //3.with builder pattern
       Stream<Object> s3= Stream.builder().build();

       //4.with arrays
        String [] s9={"hs8","838"};
      Stream<String> s7=  Arrays.stream(s9);
        s7.forEach(s->{
            System.out.println(s);
        });

        //5. with collection

        List<Integer> a= Arrays.asList(1,2,4,6);

        Stream<Integer>s4=a.stream();
        s4.forEach(s->{
            System.out.println(s);
        });



    }
}
