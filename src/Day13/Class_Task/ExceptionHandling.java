package Day13.Class_Task;
import java.util.Scanner;


public class ExceptionHandling {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        // getting the input from user and square it

        System.out.println("Enter the number : ");

        int a =0;


     try{

         a = sc.nextInt();

     }

     catch(Exception e){


     }

        System.out.print(a*a);
        System.out.println("program ended");





    }





}
