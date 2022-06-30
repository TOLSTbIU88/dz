package lesson_7;

public class FlyException extends Exception {

    private boolean isInjured;
    private int countPassengers;

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
