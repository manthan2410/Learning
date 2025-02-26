package org.example;

import java.util.HashMap;

public class MapCollection {
    public static void main(String args[])
    {
        HashMap<String,Integer> courses=new HashMap<>();
        courses.put("java",8000);
        courses.put("python",3000);
        courses.put("aws",9000);
        courses.put("Cpp",1000);
        courses.put("Angular",7000);
        System.out.println(courses);

        courses.forEach((course,fee)->{
            System.out.println(course+"=>"+fee);
        });

        System.out.println("fees of aws"+courses.get("aws"));
    }
}
