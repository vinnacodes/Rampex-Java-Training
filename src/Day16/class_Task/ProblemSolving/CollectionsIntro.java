package Day16.class_Task.ProblemSolving;

import java.util.ArrayList;
public class CollectionsIntro {


    public static void main(String [] args){

      int [] arr = {1,2,3,4,5};

      arr[0]=1;

       // System.out.println(arr);


      ArrayList<Integer> nums = new ArrayList<Integer>();



      ArrayList<Integer> nums1 = new ArrayList<Integer>();


      nums1.add(3);
      nums1.add(5);
      nums1.add(7);

      nums.add(4);

      nums.add(5);


      nums.remove(0);
      nums.remove(0);



      nums.addAll(nums1);
      nums.add(3);
//      System.out.println(nums);



      // creating a ArrayList to store five names

      ArrayList<String> names = new ArrayList<String>();



   names.add("satheesh");
   names.add("saravanan");
   names.add("vishnu");
   names.add("monika");
   names.add("yuga");



//for (String name : names){ // for each loop;
//
//    if(name.startsWith("s")){
//        System.out.println(name);
//    }
//



}








    }











