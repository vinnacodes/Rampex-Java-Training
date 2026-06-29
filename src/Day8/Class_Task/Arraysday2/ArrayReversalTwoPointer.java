package Day8.Class_Task.Arraysday2;


import java.util.Arrays;
public class ArrayReversalTwoPointer {


 public static void main(String [] s){


     int[]  nums ={1,2,3,6,5,4};

     int n =nums.length;


     int left =0;
     int right =n-1;
     int temp ;

     // swapping logic


   //  for (int i=1; i<=n/2;i++)



     while(left==right){

         temp = nums[left];
         nums[left] = nums[right];
         nums[right] = temp;


         left++;
         right--;

     }
     System.out.println(Arrays.toString(nums));



 }






}
