package Day18.class_task;
import java.util.ArrayDeque;
public class ArrayDequeTest {


    public static void main(String[] args) {


     ArrayDeque<Integer> dq =   new ArrayDeque<Integer>();

     dq.add(5);
     dq.add(6);
     dq.add(3);

//        System.out.println(dq);
//        System.out.println(dq.peek());
//        System.out.println(dq.peek());
//        System.out.println(dq);


        String name ="anu";
        String name1 ="anu";

        String name2 =new String("anu");
        String name3 =new String("anu");

        System.out.println(System.identityHashCode(name2));
        System.out.println(System.identityHashCode(name3));


    }
}
