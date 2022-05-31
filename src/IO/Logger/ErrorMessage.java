package IO.Logger;

public class ErrorMessage {

    private String errorLevel;
    private String errorMessage;
    private String errorTime;

    public ErrorMessage(String errorLevel, String errorMessage, String errorTime) {
        this.errorLevel = errorLevel;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public String toLine() {
        return errorTime + ": " + errorLevel + " - " + errorMessage;
    }
}
