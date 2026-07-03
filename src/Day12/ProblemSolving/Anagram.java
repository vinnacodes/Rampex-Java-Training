package Day12.ProblemSolving;

public class Anagram {

    public static main(String [] args){


        //System.out.println(isAnagram("pot" ,"top"));

        isAnagram("pot","top");

    }

    public static boolean  isAnagram( String s1,String s2){

        //input 2  String arguments
        //o/p : true or false
        //steps: 1. check and compare the length of
                 // both strings
              // 2.if length not same return false ,
                // else check further

       if(s1.length() ==s2.length()){

           // further check    //s1 =pot
                               // s2 =top


           for(int i=0;i<s2.length();i++){

               for (int j=0;j<s1.length();j++){  //top

                   if (s1.charAt(i)==s2.charAt(j)){



                       return true;
                   }


                   }
               }

           }







       }





    }



}
