package Day22.sorting;

import java.util.Arrays;
public class BubbleSort {



    public static void main(String [] args ){


        int[] arr ={1,2,3,5};
        bubbleSort(arr);

    }
    public static void bubbleSort(int [] arr){

     //how many comparisons
     int  n =arr.length;
     int temp =0;
int count =0;

boolean swapped =false;
int swapCount=0;

     for(int i =0; i<n-1;i++){

         //inner loop compares itself to next elements


         for(int j =0 ; j<n-1;j++){

             count++;
             if(arr[j]>arr[j+1]){

                 temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]= temp;

                 swapped =true;
                 swapCount++;
             }


         }
         //---------
         System.out.println(Arrays.toString(arr));

         if(swapped!=true){

             break;
         }

     }


     System.out.println(Arrays.toString(arr));
        System.out.println(count + " checks");
        System.out.println(swapCount + " swaps");

    }




}
