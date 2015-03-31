package calculations;

import org.junit.Test;

import java.util.*;

/**
 *
 */
public class AverageCount {

    @Test
    public void test(){


        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        OptionalDouble average = numbers.stream().mapToInt(myInt -> myInt).average();

        double asDouble = average.getAsDouble();

        Optional<Integer> max2 = numbers.stream().min(Comparator.<Integer>reverseOrder());

        assert(true);
    }
}
