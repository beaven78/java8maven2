package calculations;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by St on 31/03/2015.
 */
public class MinCount {

    @Test
    public void test(){


        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        Optional<Integer> max = numbers.stream().min(Comparator.<Integer>naturalOrder());

        Optional<Integer> max2 = numbers.stream().min(Comparator.<Integer>reverseOrder());

        assert(true);
    }
}
