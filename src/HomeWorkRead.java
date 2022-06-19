import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkRead {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/konstantinvolkov/Desktop/java/dz/out/resource/my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            String readLine = bufferedReader.readLine();
            System.out.println(readLine);
        }

        fileReader.close();
    }
}
