package auto;

public class HomeWork {
    public static void main(String[] args) {
        Car granta = new Lada();
        Car corolla = new Toyota();
        Car[] cars = {granta,corolla};
        granta.startMoving();
        granta.stop();
        granta.turnLight();
        corolla.turnLight();
        corolla.stop();
        corolla.startMoving();


    }
}
