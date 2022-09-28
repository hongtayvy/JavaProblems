package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class BasicFileReader {

    public static String readFile(String inputFile) throws IOException {
        try{
            return Files.readString(Paths.get(inputFile));
        } catch (IOException e) {
            throw e;
        }
    }
}
