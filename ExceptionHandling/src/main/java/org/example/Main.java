package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
 class AgeException extends Exception{
     AgeException()
     {
         super("Age is wrong");
     }

}
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Programme started!");

        try{
            int n1= sc.nextInt();
            int n2= sc.nextInt();

            System.out.println("Numbers are coming");
            if(n2<2)
            {
                throw new AgeException();
            }

            System.out.println("Numbers are coming"+n1/n2);

        } catch(ArithmeticException e)
        {
            e.getMessage();
            System.out.println("Arithem,d");
       e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            e.getMessage();
            System.out.println("Input mismatch");
            e.printStackTrace();
        }
        catch(AgeException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Age exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Generalized");
        }
        finally{
            System.out.println("Final is executed");
        }
        System.out.println("Programme Ended!");
    }
}