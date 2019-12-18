public class TooLittleResultException extends RuntimeException {
    public TooLittleResultException() {
    }

    public TooLittleResultException(String message) {
        super(message);
    }

    public TooLittleResultException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooLittleResultException(Throwable cause) {
        super(cause);
    }

    public TooLittleResultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
