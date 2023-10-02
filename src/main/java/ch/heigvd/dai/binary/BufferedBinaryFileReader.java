package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
        while (buffer.read() != -1) {}
        buffer.close();
    }
}
