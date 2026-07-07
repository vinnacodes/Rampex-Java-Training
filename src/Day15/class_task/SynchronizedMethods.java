package Day15.class_task;

public class SynchronizedMethods {


    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();


        b1.balance =800;



        GpayAccount g1 = new GpayAccount(b1);

        PhonePe p1 = new PhonePe(b1);

        g1.pay();
        p1.pay();


        System.out.println(b1.balance);


    }





    }

    class GpayAccount extends Thread{

        BankAccount b;

        GpayAccount(BankAccount bankAcc){
            System.out.println(" gpay Account created");
            this .b=bankAcc;
        }


        // this method will take 500 rs from your account
        public void pay(){

          b.withdraw(500);
            System.out.println("gpay withdraw 500 ");
        }
    }

    class PhonePe extends Thread{
        BankAccount b;

        PhonePe(BankAccount bankAcc){
            this.b =bankAcc;
        }


        public void pay(){

            b.withdraw(300);
            System.out.println("phone pe withdraw 300 rupees");
        }

    }





    class BankAccount{

        String name ;
        int balance;


        //-------------- withdraw method

        synchronized void    withdraw(int amount){

            balance = balance -amount;
        }

    }


