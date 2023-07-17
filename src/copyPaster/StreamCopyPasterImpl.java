package copyPaster;

import java.io.*;

public class StreamCopyPasterImpl implements CopyPaster {

    private final InputStream is;
    private final OutputStream os;

    public StreamCopyPasterImpl(InputStream is, OutputStream os) {
        this.is = is;
        this.os = os;
    }

    @Override
    public void copy() throws IOException {
        while (is.available() > 0) {
            os.write(is.read());
        }
        is.close();
        os.close();
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = {65, 66, 67, 68};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        OutputStream os = new FileOutputStream(new File("files/file3.txt"));

        CopyPaster copyPaster = new StreamCopyPasterImpl(byteArrayInputStream, os);
        copyPaster.copy();
    }
}
