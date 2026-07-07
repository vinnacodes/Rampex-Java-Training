package Day14.Class_Task;

public class InterfaceTest {

  public static void main(String [] args){

      C c1 = new C();
      c1.run();

  }

}
//--------
class A{

    void run(){

        System.out.println("A is running");
    }
}

interface b{
    void run();  // abstract method
}


class C extends A implements b{

   public void run(){
        System.out.println(" c is running");
    }
}
