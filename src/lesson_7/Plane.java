package lesson_7;

public class Plane extends FlyException implements Fligths {

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    private int countPassengers;
    public void fly (){
        System.out.println("Самолет летит");
    }

    @Override
    public void nofly() {
        super.nofly();
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
