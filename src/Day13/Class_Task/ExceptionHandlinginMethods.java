package Day13.Class_Task;

public class ExceptionHandlinginMethods {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();








    }


}


class BankAccount{
    String name ;
    int balance;

    public void deposit (int amount) throws ArithmeticException, InvalidAmountException {

        if (amount<0){
            throw new InvalidAmountException();

        }
        balance =balance +amount;

        System.out.println("amount deposited");
    }


}
