package file.improvments;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 */
public class FileWalk {

    @Test
    public void test() throws IOException {

        Path path = Paths.get("c:\\temp");

        //Walk will go through all the files in the file tree root
        Stream<Path> walk = Files.walk(path, FileVisitOption.FOLLOW_LINKS);

        walk.forEach(path2 -> System.out.println(path2.getFileName()));
    }
}
