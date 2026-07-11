package Day19.class_task;


@FunctionalInterface
interface flyable{

//public void takeoff();
    public void fly();
}

public class LambdaExpression {
    public static void main(String[] args) {

flyable f = ()->{
    System.out.println("flying");
};
f.fly();

//Thread t1 = new Thread(()->{System.out.println("new thread created ");});
//Thread t2 = new Thread(()->{System.out.println("new thread created ");});
//t1.start();
//t2.start();
    }


}