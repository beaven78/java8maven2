package file.improvments;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 */
public class FileLines {

    @Test
    public void test() throws IOException {

        Path path = Paths.get("c:\\temp\\temp.txt");
        //Returns a Stream<Path>
        Files.lines(path).forEach(str -> System.out.println(str));
    }

}
