package Day14.Class_Task;

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int rNum  =  (int) (10 * Math.random());


        System.out.print(" Guess the number ??? ");

        int num =sc.nextInt();

        if(num ==rNum){
            System.out.println("you won !!!!");
        }
        else{
            System.out.println("you lost :( it is " +rNum);
        }



    }

}
