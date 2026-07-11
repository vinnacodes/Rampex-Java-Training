package Day17.class_Task.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LinkedHashSetTest {


    public static void main(String[] args) {


      LinkedHashSet<String> ls=  new LinkedHashSet<>();

      ls.add("karthik");
      ls.add("jane");
      ls.add("john");
      ls.add("sam");
      ls.add("jane");

      java.util.HashSet<String> hs = new java.util.HashSet<>();




        hs.add("karthik");
        hs.add("jane");
        hs.add("john");
        hs.add("sam");
        hs.add("jane");

        // creating a tree set variable
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("karthik");
        ts.add("jane");
        ts.add("john");
        ts.add("sam");
        ts.add("jane");


//        System.out.println("original  [karthik, jane, john, sam,sam]");
//        System.out.println(   "Linked hash Set : "+ ls);
//
//        System.out.println("Hashset "+hs);
//        System.out.println("Tree set  data "+ ts);
//

       TreeSet<Integer> ts1= new TreeSet<Integer> ();
        ts1.add(2);
        ts1.add(3);
        ts1.add(2);
        ts1.add(1);

        System.out.println(ts1);

        System.out.println(ts1.tailSet(3));





    }
}
