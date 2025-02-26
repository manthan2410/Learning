package org.example;

public class ThreadImpl {
    public static void main(String[] args) {
        Runnable thread1=()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1=new Thread(thread1);
        t1.setName("My initial thread with lambda");
        System.out.println(t1.getName());
        t1.start();

        Runnable thread2=()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i*2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2=new Thread(thread2);
        t2.setName("My table thread with lambda");
        System.out.println(t2.getName());
        t2.start();
    }
}
