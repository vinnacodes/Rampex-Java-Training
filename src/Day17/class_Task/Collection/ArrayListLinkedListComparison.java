package Day17.class_Task.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListComparison {

    public static void main(String [] args) throws InterruptedException {



        ArrayList<Integer> arr = new ArrayList<>();

      LinkedList<Integer>  li =  new LinkedList<>();


        for(int i=0;i<100000;i++){


            arr.add(i);
        }
        for(int i=0;i<100000;i++){


            li.add(i);
        }
long start =System.nanoTime();



for(int i=0;i<100000;i++){


    arr.get(i);
}
        long end =System.nanoTime();
        System.out.println("reading in Arraylist in " + (end-start) + " ms");


//---------adding in linked list


        long lstart =System.nanoTime();



        for(int i=0;i<100000;i++){


            li.get(i);
        }
        long lend =System.nanoTime();
        System.out.println("reading in LinkedList in " + (lend-lstart) + " ms");



    }



}
