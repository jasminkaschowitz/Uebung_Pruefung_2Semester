package IO.Transactions;

public class TransactionObjectException extends Exception{
    public TransactionObjectException() {
        super();
    }

    public TransactionObjectException(String message) {
        super(message);
    }

    public TransactionObjectException(String message, Throwable cause) {
        super(message, cause);
    }
}
