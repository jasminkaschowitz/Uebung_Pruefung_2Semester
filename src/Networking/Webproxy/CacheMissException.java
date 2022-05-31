package Networking.Webproxy;

public class CacheMissException extends Exception{

    public CacheMissException() {
    }

    public CacheMissException(String message) {
        super(message);
    }

    public CacheMissException(String message, Throwable cause) {
        super(message, cause);
    }
}
