package Day7.class_Task;

public class LabelledBreak {


    public static void main(String [] args){


       one_month_loop:
        for (int week =1; week<=4;week++){

            one_week_loop:
            for (int day=1; day<=7;day++){


                if (day==3){break one_month_loop;}

                System.out.println(   " week : "+ week +" day : "+ day);




            }
        }


    }
}
