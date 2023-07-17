package readerWriter;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderTest {

    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("Go from Java");

        char c = (char) reader.read();
        System.out.println("c = " + c);

        reader.close();
    }
}
