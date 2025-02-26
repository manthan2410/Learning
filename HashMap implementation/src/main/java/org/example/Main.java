package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> friends=new HashMap<>();
        friends.put("Manthan",23);
        friends.put("Pritish",2);
        friends.put("Pritish1",2);

        friends.put("Pritish2",2);
        friends.put("Pritish3",2);
        friends.put("Pritish4",2);

        friends.put("Pritish5",2);
        friends.put("Pritish6",2);
        friends.put("Pritish7",2);

        friends.put("Pritish8",2);



        friends.put("Pritish9",2);

        friends.put("Pritish10",2);

        friends.put(null,5);
        System.out.println("Friends!"+friends);
    }
}