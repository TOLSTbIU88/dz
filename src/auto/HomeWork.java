package auto;

import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        Lada granta = new Lada();
        Toyota corolla = new Toyota();
        granta.startMoving();
        granta.stop();
        granta.crash();
        granta.turnLight();
        corolla.startMoving();
        corolla.stop();
        corolla.turnLight();
        corolla.turnMuzic();


        Financialrecord financialrecord = new Financialrecord(500, 300);
        FileWriter fileWriter = new FileWriter("/Users/konstantinvolkov/Desktop/java/dz/out/resource/report.txt");
        fileWriter.write("доходы " + financialrecord.getIncomes() + " " + "расходы " + financialrecord.getOutcomes());
        fileWriter.close();


        Car[] cars = new Car[40];

        for (int i = 0; i < cars.length; i++) {
            if (i <= 19) {
                cars[i] = CarFactory.NovLada();
            }
            if (i >= 20) {
                cars [i]= CarFactory.NovToyota();
            }
        }
    }
}
