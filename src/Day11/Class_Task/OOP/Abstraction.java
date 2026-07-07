package Day11.Class_Task.OOP;

public class Abstraction {

    // Telling what to do ,not how to do

    //partial abstraction
    // full abstraction
   public static void main(String [] ar){







   }




}
  abstract class Phone{




    public abstract void call();

    public  abstract void message();



}


class Iphone extends InterfaceTesting {

    public void call(){

        System.out.print("calling from iphone");
    }

    public void message(){

        System.out.println("message from iphone");
    };




    public void takePhoto(){


        System.out.println("photo captured");
    }

}


