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
    public void fly () throws FlyException{
        if (countPassengers < 0) {
                throw new FlyException("Ошибка:Пассажиров в самолете меньше 0",countPassengers);
            } else {
        }
        System.out.println("Самолет летит");
    }
}
