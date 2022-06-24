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


        Financialrecord financialrecord = new Financialrecord(500,300);
        FileWriter fileWriter = new FileWriter("/Users/konstantinvolkov/Desktop/java/dz/out/resource/my_file2.txt");
        fileWriter.write ("доходы" + financialrecord.getIncomes() +" "+"расходы" +  financialrecord.getOutcomes());
        fileWriter.close();

    }
}
