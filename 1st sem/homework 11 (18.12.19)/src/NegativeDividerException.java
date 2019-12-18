// проверяемое исключение
public class NegativeDividerException extends Exception {
    public NegativeDividerException() {
    }

    public NegativeDividerException(String message) {
        super(message);
    }

    public NegativeDividerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeDividerException(Throwable cause) {
        super(cause);
    }

    public NegativeDividerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
