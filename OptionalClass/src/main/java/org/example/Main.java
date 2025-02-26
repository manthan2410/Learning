package org.example;


import java.util.Optional;




public class Main {
    public static Optional<String> getName(){
        return Optional.ofNullable(null);
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String str="Manthan";
      Optional<String> st=  Optional.ofNullable(str);
      System.out.println(st.isPresent());
     System.out.println(   st.get());
        System.out.println(st.orElse("testing the optional"));


        //real time use
        Optional<String> ops=getName();
        System.out.println(ops.orElse("No val is present"));

        //create empty optional
       Optional<String> emp=Optional.empty();
        System.out.println(emp.isPresent());
    }


}