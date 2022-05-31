package Networking.Webproxy;

public class UrlLoaderException extends Exception{
    public UrlLoaderException() {
    }

    public UrlLoaderException(String message) {
        super(message);
    }

    public UrlLoaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public UrlLoaderException(Throwable cause) {
        super(cause);
    }
}
