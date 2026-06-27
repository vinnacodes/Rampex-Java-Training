package Day7.class_Task.Arrays;

public class FindingMax {



    public static void main(String []args){



        int [] nums = {1,2,4,5,3};


        int max =0;

        for (int i=0 ; i<nums.length;i++){



            if(nums[i]>max){

                max =nums[i];
            }


        }//after loop ends printing the max value
        System.out.println(" maximum value is "+ max);





    }
}
