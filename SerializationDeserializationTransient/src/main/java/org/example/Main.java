package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        try{
            Student st=new Student(24,"Manthan","manthanmanu2000@gmail.com","kalanwali");
            FileOutputStream fs=new FileOutputStream("ob.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fs);
            oos.writeObject(st);
            oos.close();
            fs.close();
            oos.flush();
           System.out.println("File is created");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        try{
            FileInputStream fis=new FileInputStream("ob.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student st=(Student) ois.readObject();
            st.display();
            System.out.println(st.getAge()+st.getName()+st.getAddress()+st.getEmail());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}