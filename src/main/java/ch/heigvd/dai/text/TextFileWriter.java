package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        FileWriter writer = new FileWriter(filename, StandardCharsets.UTF_8);
        for (int i = 0; i < sizeInBytes; i++) {
            writer.write(0);
        }
        writer.close();
    }
}
