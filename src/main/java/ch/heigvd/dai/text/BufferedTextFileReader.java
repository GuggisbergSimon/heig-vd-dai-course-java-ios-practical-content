package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(filename));
        while(buffer.read() != -1) {}
        buffer.close();
    }
}
