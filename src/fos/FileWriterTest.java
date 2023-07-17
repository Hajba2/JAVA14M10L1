package fos;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {
        File file = new File("files/file2.txt");

        System.out.println("file.exists() = " + file.exists());

        OutputStream fos = new FileOutputStream(file);

        int[] arr = {1, 1, 444, 888};

        StringBuilder sb = new StringBuilder();

        for (int a : arr) {
            sb.append(a);
            sb.append(", ");
        }
        sb.append("\n");

        fos.write(sb.toString().getBytes(StandardCharsets.UTF_8));
        fos.write("Hello from Java \n".getBytes(StandardCharsets.UTF_8));
        fos.write("Hello from Java \n".getBytes(StandardCharsets.UTF_8));

        fos.flush();
        fos.close();

    }
}
