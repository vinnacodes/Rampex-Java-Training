package Day19.class_task.StreamAPi;
import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo {


    public static void main(String[] args) {

        ArrayList<Integer> li =new ArrayList<Integer>();

        li.add(4);
        li.add(5);
        li.add(8);
        li.add(9);
        li.add(7);


      List<Integer> l=li.stream().filter((n)->n%2==0).collect(Collectors.toList());






        System.out.println(l);

















//      ArrayList<Integer>  even = new ArrayList<Integer>();
//
//        for(int i : li){
//
//          if(i%2==0){
//
//              even.add(i);
//          }
//
//        }
//
//        System.out.println(even);






    }
}
