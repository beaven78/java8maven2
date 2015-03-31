package calculations;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by St on 31/03/2015.
 */
public class MaxCount {

    @Test
    public void test(){

        List<String> numbers = Arrays.asList("one", "two", "three");

        Optional<String> max = numbers.stream().max(Comparator.<String>naturalOrder());

        Optional<String> max1 = numbers.stream().max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        assert(true);
    }

    @Test
    public void test2(){

        List<Integer> numbers = Arrays.asList(1,5,2,5,7,9,3);

        Optional<Integer> max = numbers.stream().max(Comparator.<Integer>naturalOrder());

        Optional<Integer> max2 = numbers.stream().max(Comparator.<Integer>reverseOrder());

        assert(true);
    }
}
