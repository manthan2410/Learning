package org.example;

public class Main {
    private static Integer j=1;
    public static void main(String[] args) {


//       Thread1 t1=new Thread1();
//           Thread thread=new Thread(t1);
//        thread.start();
//        try {
//            thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Thread 1!")
//        ;
//
//        Thread2 t2=new Thread2();
//        t2.start();
//        System.out.println("Thread 2!");



        //using anonymous class
//       Runnable runnable=new Runnable(){
//            public void run() {
//               while(j<15)
//               {
//                   System.out.println(j+"through anonymous class");
//                   j++;
//               }
//           }
//       };
//    Thread tNew=new Thread(runnable);
//    tNew.start();





        //through anonymous function
        Runnable r=()->{
            System.out.println("dhggd");
        };
        Thread t=new Thread(r);
        t.start();;
  }

}