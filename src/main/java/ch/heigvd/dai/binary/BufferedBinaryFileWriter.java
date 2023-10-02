package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(filename));
        for (int i = 0; i < sizeInBytes; i++) {
            buffer.write(0);
        }
        buffer.flush();
        buffer.close();
    }
}
