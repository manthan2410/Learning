package org.example;
import java.util.*;

public class Traversal {

    public static void main(String args[])
    {
      ArrayList<String> names=new ArrayList<>();
      names.add("Pritish");
      names.add("Manthan");
      names.add("Santosh");
      names.add("Jimmy");
      names.add("Sahil");
      names.add("Shyam");

      //iterate using foreach loop
        for(String str:names)
        {
          System.out.println(str+"\t");
          StringBuffer br=new StringBuffer(str);
          System.out.println(br.reverse());
        }

        System.out.println("Iterating using iterator"+"**********************");

        Iterator<String> itr=names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Iterating using list iterator"+"**********************");

        ListIterator<String> litr=names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

        System.out.println("Iterating using for each mtd"+"**********************");

      names.forEach(name->{
          System.out.println(name);
      });
        System.out.println("Treeset iterating using for each mtd"+"**********************");

      TreeSet<String> name=new TreeSet<>();
      name.addAll(names);
      name.forEach(nm->{
          System.out.println(nm);
      });

        System.out.println("vector iterating using for enumeration"+"**********************");
 Vector<String> nameList=new Vector<>();
 nameList.addAll(names);
 Enumeration<String> enm= nameList.elements();
 while(enm.hasMoreElements())
 {
     System.out.println(enm.nextElement());
 }
    }
}
