package IO.Adressbuch;

public class AddressLoadWrongFormatException extends Exception {
    public AddressLoadWrongFormatException() {
    }

    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
