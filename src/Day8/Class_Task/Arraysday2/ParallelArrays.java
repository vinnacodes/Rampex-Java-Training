package Day8.Class_Task.Arraysday2;
import java.util.Scanner;
import java.util.Arrays;

public class ParallelArrays {



    public static void main(String [] a){
     Scanner sc = new Scanner(System.in);

        String [] drinks ={"pepsi", "sprite","maza","mountain dew","campa"};

        int [] prices =  {40,20,45,40,10};


        int [] stock ={5,5,5,5,5};
        int totalbill = 0;




        // gettitng the user input
        System.out.println( "pepsi, sprite,maza,mountain dew,campa");
        while(true) {
            System.out.print("Enter the name of the drink : ");
            String name = sc.nextLine();
            if (name.equals("exit")) {
                System.out.println("thank you");
                break;
            }


            System.out.println("ENter the Quantity : ");
            int qty = sc.nextInt();
            sc.nextLine();
            //getting the quantity from user

            // finding the position of the drink in the array

            for (int i = 0; i < drinks.length; i++) {

                if (name.equals(drinks[i])) {

                    // i is the index or position of the drink in that Array

                    if (qty <= stock[i]) {
                        totalbill = totalbill + (prices[i] * qty);

                        stock[i] = stock[i] - qty;// printing the bill;

                    } else {

                        System.out.println("Insufficient stock !!! ");
                    }


                }
            }
        }
        System.out.print(" The total amt is " + totalbill);


    }
}
