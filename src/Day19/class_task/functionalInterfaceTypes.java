package Day19.class_task;
import java.util.function.*;
import java.util.function.Predicate;
public class functionalInterfaceTypes {


    public static void main(String[] args) {

     Predicate<Integer> p  =(Integer n)->n%2==0;



                     Supplier<Integer> s= ()->5;


      Function<String ,String> f  = (String str) -> str.toUpperCase();
      Function<String ,String>  m = (String str) -> str.toUpperCase();

        System.out.println(f.apply("keerthana"));
        System.out.println(m.apply("Rifa"));



        System.out.println( p.test(23));

    }

}
