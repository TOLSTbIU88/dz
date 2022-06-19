package auto;

public abstract class Car {
    public void startMoving() {
        System.out.println("начали движение");
    }
    public void stop ()  {
        System.out.println("остановились");
    }
    public void turnLight () {
        System.out.println("включили фары");
    }
}
