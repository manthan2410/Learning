package org.example;
 class ThreadTest implements Runnable{
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

public class ThreadOperations {
    public static void main(String[] args) {

        System.out.println("Thread Started");
          int x=55+839;
          System.out.println(x);
          Thread t=Thread.currentThread();
          System.out.println(t.getName()+" current thread name");
          t.setName("My test Thread");
        System.out.println(t.getName()+" After reset current thread name");
        System.out.println(t.getId()+" After reset current thread id");
        try{
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        ThreadTest test=new ThreadTest();
       Thread t1=new Thread(test);
        System.out.println("Thread user defined"+t1.getName());
       t1.start();

        System.out.print("Thread Stopped");

    }
}
