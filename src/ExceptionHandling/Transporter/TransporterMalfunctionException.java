package ExceptionHandling.Transporter;

public class TransporterMalfunctionException extends Exception{
    public TransporterMalfunctionException() {
    }

    public TransporterMalfunctionException(String message) {
        super(message);
    }

    public TransporterMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }
}
