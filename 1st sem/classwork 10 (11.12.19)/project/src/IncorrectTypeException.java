public class IncorrectTypeException extends Exception {
    public IncorrectTypeException() {
    }

    public IncorrectTypeException(String message) {
        super(message);
    }

    public IncorrectTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectTypeException(Throwable cause) {
        super(cause);
    }

    public IncorrectTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
