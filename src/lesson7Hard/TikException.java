package lesson7Hard;

public class TikException extends Exception{
private boolean crash;

    public TikException(boolean crash) {
        this.crash = crash;
    }

    public TikException(String message, boolean crash) {
        super(message);
        this.crash = crash;
    }

}
