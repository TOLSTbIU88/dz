import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkRead {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/konstantinvolkov/Desktop/java/dz/out/resource/my_first_file.txt");
        String rezult = "";
        while (fileReader.ready()){
            int readtxt = fileReader.read();
            rezult += (char) readtxt;

        }
        System.out.println(rezult);
    }
}
