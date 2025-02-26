package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //creating Type safe collection
        ArrayList<String> name=new ArrayList<>();
        name.add("Manthan");
        name.add("Pritish");
        //property 1: duplicate allowed in list
        name.add("Manthan");
        //property2: index based
        System.out.println(name.get(1));
        // property 3: order also preserved


        name.remove("Manthan");

        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("Pritish"));
        System.out.println("Empty status"+name.isEmpty());
        name.set(1,"Jimmy");
        name.add(1,"Santosh");

        Vector<String> listNames=new Vector<>();
        listNames.addAll(name);
        System.out.println("vector list"+listNames);
        name.clear();
        //we cant add other datatype values in typesafe collections
      //  name.add(2);




        //untype safe collection
        ArrayList values=new ArrayList();
        values.add("Test");
        values.add(5);
        values.add(16.2);
        values.add(true);
        //we can add multiple type of values in untype safe collection
        System.out.println(values);
////


        //SET practice

        HashSet<Double> digi=new HashSet<>();
        digi.add(34.56);
        digi.add(9928297.367);
        digi.add(1.536);
        digi.add(57.278);
        digi.add(5.278);
        System.out.println("hashset"+digi);

        TreeSet<Double> tree=new TreeSet<>();
        tree.addAll(digi);
        System.out.println("hashset"+tree);

    }
}