package Day6.class_Task;

public class Facto {


    public static void main(String[] args) {


        facto(50);
    }


    public static void facto(int n ){

        long total =1l;
        for (int i=1;i<=n ;i++){


            total =total *i;
        }

        System.out.println(total);

    }
}
