package Day19.class_task;

public class AnonymousClass {
    public static void main(String[] args) {

      //using Runnable Interface

     //   Notification n1 = new Notification();

     Runnable  r1 = ()->{
         System.out.println("this is run method ");
     };
    r1.run();
    }
}


 // class Notification implements Runnable

class Messaging{



    public void sendMessage(){

        System.out.println("sending message");

    }
}

