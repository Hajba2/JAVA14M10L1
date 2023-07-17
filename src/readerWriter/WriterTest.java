package readerWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("files/writer.txt");

        writer.write("|sjdgfv");

        writer.close();
    }
}
