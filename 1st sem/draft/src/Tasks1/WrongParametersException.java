package Tasks1;

public class WrongParametersException extends Exception {
    public WrongParametersException() {
    }

    public WrongParametersException(String message) {
        super(message);
    }

    public WrongParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongParametersException(Throwable cause) {
        super(cause);
    }
}
