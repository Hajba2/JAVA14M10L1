package copyPaster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyPaster implements CopyPaster {

    private final File copyFrom;
    private final File copyTo;

    public FileCopyPaster(File copyFrom, File copyTo) {
        this.copyFrom = copyFrom;
        this.copyTo = copyTo;
    }

    @Override
    public void copy() throws IOException {
        new StreamCopyPasterImpl(new FileInputStream(copyFrom), new FileOutputStream(copyTo)).copy();
    }

    public static void main(String[] args) throws IOException {
        new FileCopyPaster(new File("files/copyFrom.txt"),new File( "files/copyTo.txt")).copy();
    }

}
