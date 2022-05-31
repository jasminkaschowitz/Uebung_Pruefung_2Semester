package Uebungsabende.Einwohner;

public class DataFileException extends Exception{

    public DataFileException() {
    }

    public DataFileException(String message) {
        super(message);
    }

    public DataFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
