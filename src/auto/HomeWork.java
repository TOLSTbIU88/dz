package auto;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {
    public static void main (String[] args) {
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

    }

    public static void writer () throws IOException {
        Financialrecord financialrecord = new Financialrecord(500,300);
        FileWriter fileWriter = new FileWriter("/Users/konstantinvolkov/Desktop/java/dz/out/resource/my_file2.txt");
        fileWriter.write (financialrecord.getIncomes() + financialrecord.getOutcomes());

    }
}
