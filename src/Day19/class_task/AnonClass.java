package Day19.class_task;

public class AnonClass {


    public static void main(String[] args) {


        interface human{

            public void shout();
        }







     human h   = new human(){

            public void shout(){
                System.out.println("someone is shouting");
            }
        };


    }
}







