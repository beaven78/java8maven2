package collecting.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.partitioningBy;

/**
 *
 */
public class PartitionIntInterface {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        //PartitionBy takes a Predicate interface
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(partitioningBy(number -> number == 5));

        System.out.println(collect);
    }
}