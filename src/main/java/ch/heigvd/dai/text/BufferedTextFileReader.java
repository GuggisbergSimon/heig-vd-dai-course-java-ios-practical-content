package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8));
        while(buffer.read() != -1) {}
        buffer.close();
    }
}
