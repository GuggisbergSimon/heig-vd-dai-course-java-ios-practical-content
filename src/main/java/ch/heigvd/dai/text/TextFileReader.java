package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        while(reader.read() != -1) {}
        reader.close();
    }
}
