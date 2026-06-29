package Day7.class_Task.Arrays;

public class FindingMin {




    public static void main(String []args){



        int [] nums = {-2,-1,1,2,4,5,3};


        int min =nums[0];

        for (int i=0 ; i<nums.length;i++){


            if(nums[i]<min){

                min =nums[i];
            }


        }//after loop ends printing the max value
        System.out.println(" minimum value is "+ min);





    }
}
