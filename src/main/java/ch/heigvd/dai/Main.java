package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    private static void testAllTypes(int sizeInBytes) throws IOException {
        // non buffered, binary
        Measure.write("binary_" + sizeInBytes + "B.bin", sizeInBytes, false, Measure.FileType.BINARY);
        Measure.read("binary_" + sizeInBytes + "B.bin", false, Measure.FileType.BINARY);

        //buffered, binary
        Measure.write("binary_" + sizeInBytes + "B.bin", sizeInBytes, true, Measure.FileType.BINARY);
        Measure.read("binary_" + sizeInBytes + "B.bin", true, Measure.FileType.BINARY);

        // non buffered, text
        Measure.write("text_" + sizeInBytes + "B.txt", sizeInBytes, false, Measure.FileType.TEXT);
        Measure.read("text_" + sizeInBytes + "B.txt", false, Measure.FileType.TEXT);

        //buffered, text
        Measure.write("text_" + sizeInBytes + "B.txt", sizeInBytes, true, Measure.FileType.TEXT);
        Measure.read("text_" + sizeInBytes + "B.txt", true, Measure.FileType.TEXT);
    }

    public static void main(String[] args) throws IOException {
        //1B
        testAllTypes(1);
        //1KiB
        testAllTypes(1000);
        //1MiB
        testAllTypes(1000000);
        //5MiB
        testAllTypes(5000000);
    }
}
