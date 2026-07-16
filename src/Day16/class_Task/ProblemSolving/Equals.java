package Day16.class_Task.ProblemSolving;

public class Equals {


    public static void main(String[] args) {

 Car c1= new Car("bmw","m6");

 Car c2 = new Car("bmw","m5");




      //  System.out.println(c1.equals(c2));
        System.out.println(c1);

    }
}


class Car{


    String name;
    String model;

    Car(String name , String model){

        this.name = name;
        this.model = model;
    }




    public boolean equals(Car c) {

        if (this.name.equals(c.name) && this.model == c.model) {

            return true;

        } else {
            return false;
        }


    }

        // toString method decides what will be in the op if this class's object is printed



      public  String toString(){

            return this.name + " "+this.model;


    }




}