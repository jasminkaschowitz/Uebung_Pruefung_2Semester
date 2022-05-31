package IO.Adressbuch;

public class AddressExportException extends Exception {
    public AddressExportException() {
    }

    public AddressExportException(String message) {
        super(message);
    }

    public AddressExportException(String message, Throwable cause) {
        super(message, cause);
    }
}
