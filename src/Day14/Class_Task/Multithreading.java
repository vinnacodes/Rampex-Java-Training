package Day14.Class_Task;

public class Multithreading {


    public static void main(String[] args) {

        MyThread mt = new MyThread();

       Thread t1 = new Thread(mt);

      Thread t2=   new Thread (new Worker());

      t2.setName("vishnu");

      t2.start();



        t1.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("main thread  working : " + (char)i);
        }
    }
}

class MyThread extends Thread{
    //by Extending the Thread class


    @Override
    public void run() {

        for (int i = 1; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
    }
}

class Worker extends Thread{

    public void run(){

        greet();

    }

    public static void greet(){

        System.out.println("good evening  by "  + Thread.currentThread().getName());
    }



}


