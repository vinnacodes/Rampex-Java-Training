package Day7.class_Task.Arrays;

import java.util.Scanner;

import java.util.Arrays;
public class ArraysUserInput {

    public static void main(String [] args){


        int [] arr =new int[5];

        Scanner sc = new Scanner(System.in);


        for (int i =0 ;i<5;i++) {
            System.out.println("Enter the value of position : " +( i+1));
            arr[i]=sc.nextInt();

            System.out.println(Arrays.toString(arr));

        }






    }
}
