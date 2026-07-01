package Day10.class_Task.ProblemSolving;

public class PrintingTheDuplicates {


   public static void main(String [] args){

       String [] arr = {"sam","jane","sam","tom","sam"};

       //for every name in the array ,
       //compare with the remaining elements ,
       // print the name if it macthing



       for(int i=0;i<arr.length;i++){

           //System.out.println(arr[i]);

           for(int j=0;j<arr.length;j++){

              if (arr[i].equals(arr[j] )&& i!=j && i<j){ //comparing each name with other

                  System.out.println(arr[j]);
                  break;
              }

           }
       }


   }




}
