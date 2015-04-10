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
public class FileFind {

    @Test
    public void test() throws IOException {

        Path path = Paths.get("c:\\");

        //static Stream<Path>	find(Path start, int maxDepth, BiPredicate<Path,BasicFileAttributes> matcher, FileVisitOption... options)
        //Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a given starting file.

        Stream<Path> pathStream = Files.find(path, 1, (pathVar, fileAttr) -> fileAttr.isDirectory(), FileVisitOption.FOLLOW_LINKS);

        System.out.println(pathStream.count());
    }
}

