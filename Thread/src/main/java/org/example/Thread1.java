package org.example;

public class Thread1 implements Runnable{
    public Integer i=1;
    @Override
    public void run() {
        //process which thread executes i.e. Thread task

        while(i<=10)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i*5);
          i++;
        }
    }
}
