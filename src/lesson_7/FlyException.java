package lesson_7;

public class FlyException extends Exception {

    private boolean isInjured;
    private int countPassengers;
    public FlyException() {
    }

    public FlyException(String message) {
        super(message);
    }

    public FlyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlyException(Throwable cause) {
        super(cause);
    }

    public FlyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.isInjured = isInjured;
        this.countPassengers = countPassengers;

    }
    public boolean isInjured(){
        return isInjured;
    }

    public int getCountPassengers (){
        return countPassengers;
    }
}
