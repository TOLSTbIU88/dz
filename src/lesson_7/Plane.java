package lesson_7;

public class Plane extends FlyException implements Fligths {

    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }
    public int getCountPassengers() {
        return countPassengers;
    }
    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
    public void fly (){
        System.out.println("Самолет летит");
    }
}
