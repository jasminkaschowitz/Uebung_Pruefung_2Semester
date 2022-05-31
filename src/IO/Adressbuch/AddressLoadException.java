package IO.Adressbuch;

public class AddressLoadException extends Exception {
    public AddressLoadException() {
    }

    public AddressLoadException(String message) {
        super(message);
    }

    public AddressLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
