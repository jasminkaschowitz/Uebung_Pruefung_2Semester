package IO.Adressbuch;

public class AddressExportFileAlreadyExistsException extends Exception {
    public AddressExportFileAlreadyExistsException() {
    }

    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }

    public AddressExportFileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
