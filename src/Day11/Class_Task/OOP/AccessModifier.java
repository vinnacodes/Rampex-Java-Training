package Day11.Class_Task.OOP;

import Day11.Class_Task.Problem_Solving.AmstrongNumber;

import java.util.SortedMap;

public class AccessModifier {




    String phone ="samsung";

    public static void main(String [] args){




        //access ams from Amstrong number class from a differnet package

        AmstrongNumber a = new AmstrongNumber();

        System.out.println(a.ams);
    }


}


