package lesson_7;

public class FlyException extends Exception {

    private boolean isInjured;
    private int countPassengers;

    public FlyException(boolean isInjured, int countPassengers) {
        this.isInjured = isInjured;
        this.countPassengers = countPassengers;
    }

}
