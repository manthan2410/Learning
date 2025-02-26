package org.example;

public class Thread2 extends Thread{

    public Integer i=1;
    @Override
    public void run(){

        while(i<=5)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            i++;
        }
    }
}
