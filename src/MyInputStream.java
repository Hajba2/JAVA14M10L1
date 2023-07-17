import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyInputStream extends InputStream {

    private Queue<Character> elements;

    public MyInputStream(String str) {
        char[] chars = str.toCharArray();
        elements = new ArrayDeque<>();

        for (char c : chars) {
            elements.add(c);
        }
    }

    @Override
    public int available() throws IOException {
        return elements.size();
    }

    @Override
    public int read() throws IOException {
        if (elements.size() == 0) {
            return -1;
        }
        return elements.poll();
    }

    public static void main(String[] args) throws IOException {
        MyInputStream mis = new MyInputStream("Hello world!");

        while (mis.available() > 0) {
            System.out.println((char) mis.read());
        }
    }

}
