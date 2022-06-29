package lesson_7;

public class Plane  implements Fligths {

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
    public void fly () {
        if (countPassengers < 0) {
            System.out.println("Самолет не летит");
        }
         else
        System.out.println("Самолет летит");
    }
}
