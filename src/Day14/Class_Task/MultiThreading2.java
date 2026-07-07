package Day14.Class_Task;

public class MultiThreading2 {


    public static void main(String[] args) {


        Car c = new Car();
        c.start();

Car c2 = new Car();

c2.start();
        new Car().start();
        new Car().start();

        new Car().start();

        new Car().start();










    }



}

class Car extends Thread{



    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
