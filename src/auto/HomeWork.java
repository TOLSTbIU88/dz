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

             Car lada1 = new Lada();
             Car lada2 = new Lada();
             Car lada3 = new Lada();
             Car lada4 = new Lada();
             Car lada5 = new Lada();
             Car lada6 = new Lada();
             Car lada7 = new Lada();
             Car lada8 = new Lada();
             Car lada9 = new Lada();
             Car lada10 = new Lada();
             Car lada11 = new Lada();
             Car lada12 = new Lada();
             Car lada13 = new Lada();
             Car lada14 = new Lada();
             Car lada15 = new Lada();
             Car lada16 = new Lada();
             Car lada17 = new Lada();
             Car lada18 = new Lada();
             Car lada19 = new Lada();
             Car lada20 = new Lada();
             Car [] car = {lada1, lada2, lada3, lada4, lada5,lada6,lada7,lada8,lada9,lada10,lada11,lada12,lada13,lada14,lada15,lada16,lada17,lada18,lada19,lada20,};


            }
        }
    }
}
