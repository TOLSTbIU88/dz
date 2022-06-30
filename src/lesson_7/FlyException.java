package lesson_7;

public class FlyException extends Exception {

    private boolean isInjured;
    private int countPassengers;

    public FlyException(String isInjured, boolean countPassengers) {
        this.isInjured = isInjured;
        this.countPassengers = countPassengers;
    }


}
