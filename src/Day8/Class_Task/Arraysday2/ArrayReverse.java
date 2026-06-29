package Day8.Class_Task.Arraysday2;


import java.util.Arrays;
public class ArrayReverse {



    public static void main(String [] args){


       // reversing an Array

       String [] menu= {"veg" ,"non-veg","sweets","beverages"};

        // created 2nd Array
       String [] m1 =new String[menu.length];

       for (int i=0 ;i<menu.length;i++){


           m1 [i]=menu[menu.length -1-i];


       }
        for (int i=0 ;i<menu.length;i++){


            m1 [i]=menu[menu.length -1-i];


        }




        System.out.println(Arrays.toString(m1));
    }


}
