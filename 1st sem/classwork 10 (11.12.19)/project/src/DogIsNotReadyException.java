public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException() {
    }

    public DogIsNotReadyException(String message) {
        super(message);
    }

    public DogIsNotReadyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DogIsNotReadyException(Throwable cause) {
        super(cause);
    }

    public DogIsNotReadyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
