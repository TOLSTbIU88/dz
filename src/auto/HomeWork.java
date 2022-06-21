package auto;

import java.io.File;
import java.io.FileReader;

public class HomeWork {
    public static void main(String[] args) {
        Lada granta = new Lada();
        Toyota corolla = new Toyota();
        granta.startMoving();
        granta.stop();
        granta.turnLight();
        corolla.startMoving();
        corolla.stop();
        corolla.turnLight();
        corolla.turnMuzic();

    }
}
