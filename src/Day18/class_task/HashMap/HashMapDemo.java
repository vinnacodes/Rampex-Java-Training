package Day18.class_task.HashMap;
import java.util.HashMap;
public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String > hm =new HashMap<Integer,String>();


        hm.put(1,"vishnu");
        hm.put(2,"Manoj");
        hm.put(3,"vaishnavi");
        hm.put(null,"saniya");
//
        hm.put(4,null);



hm.remove(3);

        System.out.println(hm.get(2).length());




    }
}
