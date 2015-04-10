package collection.flatmap;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * Created by stefos on 10/04/2015.
 */
public class FlatMapExample {

    @Test
    public void test(){

        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .peek(streamElement -> System.out.println(streamElement))
                .collect(toList());

        assertEquals(asList(1, 2, 3, 4), together);

    }
}
