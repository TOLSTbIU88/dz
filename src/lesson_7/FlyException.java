package lesson_7;

public class FlyException extends Exception {

    private boolean isInjured;
    private int countPassengers;

    public FlyException(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public FlyException(String message, int countPassengers) {
        super(message);
        this.countPassengers = countPassengers;
    }

    public FlyException(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public FlyException(String message, boolean isInjured) {
        super(message);
        this.isInjured = isInjured;
    }
}
