package auto;

public abstract class Car {
    public void startMoving() {
        System.out.println("начали движение");
    }
    public void stopped ()  {
        System.out.println("остановились");
    }
    public void turnLight () {
        System.out.println("включили фары");
    }
}
