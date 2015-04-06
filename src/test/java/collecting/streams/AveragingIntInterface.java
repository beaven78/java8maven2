package collecting.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.averagingInt;

/**
 *
 */
public class AveragingIntInterface {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        Double average = numbers.stream().collect(averagingInt(number -> number));

        Double averageDouble = numbers.stream().collect(averagingDouble(number -> number));

        System.out.println(average);

        System.out.println(averageDouble);
    }
}