package pl.sda.fileconverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class JSONReader implements Reader{

    private Path path;

    @Override
    public void read(String inputFIlePath) {

        try {

            path = Paths.get(inputFIlePath);
            byte[] bytes = Files.readAllBytes(path);
            System.out.println(bytes);

        } catch (IOException exeption) {
            exeption.printStackTrace();
        }

    }
}
