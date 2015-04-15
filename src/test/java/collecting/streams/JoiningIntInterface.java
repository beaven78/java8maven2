package collecting.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

/**
 *
 */
public class JoiningIntInterface {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        List<String> numbersStr = Arrays.asList("one", "two", "three");

        //Wont compile, joining only works with Strings
        //String collect = numbers.stream().collect(Collectors.joining(",", "[", "]"));

        String collectStartEnd = numbersStr.stream().collect(Collectors.joining(",", "[", "]"));

        String collect = numbersStr.stream().collect(Collectors.joining(","));

        String collectNoParams = numbersStr.stream().collect(Collectors.joining());

        System.out.println(collectStartEnd);
        System.out.println(collect);
        System.out.println(collectNoParams);
    }
}