package Day13.Class_Task;

public class CustomException {


    public static void main(String[] args) {

    }

}


//--------------------custom
class InvalidAmountException  extends Exception{

    InvalidAmountException() {
        super();

    }
}

//----------exception that is thrown when requested
//amt is higher than the balance
class LowBalanceException extends Exception{

    LowBalanceException(){
        super();
    }
}


