// проверяемое исключение
public class WrongDividerException extends Exception {
    public WrongDividerException() {
    }

    public WrongDividerException(String message) {
        super(message);
    }

    public WrongDividerException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDividerException(Throwable cause) {
        super(cause);
    }

    public WrongDividerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
