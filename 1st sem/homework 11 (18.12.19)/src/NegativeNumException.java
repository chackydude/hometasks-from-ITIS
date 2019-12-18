public class NegativeNumException extends Exception{
    public NegativeNumException() {
    }

    public NegativeNumException(String message) {
        super(message);
    }

    public NegativeNumException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumException(Throwable cause) {
        super(cause);
    }

    public NegativeNumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
