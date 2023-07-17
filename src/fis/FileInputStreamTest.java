package fis;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("files/file.txt");

        InputStream fis = new FileInputStream(file);

        Scanner s = new Scanner(fis);

        System.out.println("s.nextLine() = " + s.nextLine());

        System.out.println("file.exists() = " + file.exists());

        fis.close();
        s.close();

    }

}
