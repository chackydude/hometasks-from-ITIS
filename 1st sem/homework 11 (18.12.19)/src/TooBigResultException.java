public class TooBigResultException extends RuntimeException {
    public TooBigResultException() {
    }

    public TooBigResultException(String message) {
        super(message);
    }

    public TooBigResultException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooBigResultException(Throwable cause) {
        super(cause);
    }

    public TooBigResultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
