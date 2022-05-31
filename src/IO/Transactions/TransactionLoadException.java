package IO.Transactions;

public class TransactionLoadException extends Exception {
    public TransactionLoadException() {
    }

    public TransactionLoadException(String message) {
        super(message);
    }

    public TransactionLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
