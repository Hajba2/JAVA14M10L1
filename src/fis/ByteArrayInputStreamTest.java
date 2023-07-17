package fis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteArrayInputStreamTest {

    public static void main(String[] args) throws IOException {
        byte[] bytes = {65, 66, 67, 68};

        ByteArrayInputStream bis2 = new ByteArrayInputStream(bytes);

        Scanner s = new Scanner(new ByteArrayInputStream(bytes));

        System.out.println("s.nextLine() = " + s.nextLine());

        bytes[0] = 68;

        while (bis2.available() > 0) {
            System.out.println("(char) bis.read() = " + (char) bis2.read());
        }

        bis2.close();
        //bis.close();


        try (ByteArrayInputStream bis3 = new ByteArrayInputStream(bytes);
             ByteArrayInputStream bis4 = new ByteArrayInputStream(bytes)) {
            System.out.println("bis3.read() = " + bis3.read());
        }
    }
}
