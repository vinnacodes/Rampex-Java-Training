package Day14.Class_Task;

public class ThreadUsingRunnable {

    public static void main(String[] args) {

        MyThread1 mt = new MyThread1();

        Thread t1 =new Thread(mt);
        t1.start();
    }

}


class MyThread1 implements Runnable{


    public void run(){


        System.out.println("  second Thread   running " + Thread.currentThread().getName());
    }

}
