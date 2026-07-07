package Day11.Class_Task.OOP;

public class BankingTest {

    public static void main(String [ ]args){



        BankAccount b1 = new BankAccount();



       b1.deposit(1000);
       // b1.withdraw(1000);
        b1.setName("deepa");

        System.out.println(b1.getName());




    }


}

class BankAccount{


   private String accName;
    int accNo;
 private float balance;


    //-----------methods----------------

    public void deposit(float amount)
    {
       balance= balance + amount;

        System.out.println("Amount deposited "+ amount + " Rs,"+
                "balance : "+ balance);


    }
    //----withdraw

    public void withdraw(float amount){


       balance = balance -amount;

        System.out.println("Amount withdrawn "+ amount + " Rs,"+
                "balance : "+ balance);

    }

    public float checkBalance()
    {

        return balance;
    }



    public void setName(String name ){

        accName =name;

    }

    public String getName(){


        return accName;
    }

}

//public
// private
// default
// protected