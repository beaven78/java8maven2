package sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by St on 31/03/2015.
 */
public class SortingUsingLambdas {

    @Test
    public void test(){

        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        //Sorted with no parameters, outputs nature order 1,2,3,5,5,7,9
        List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());

        //Sorted taking a comparator object as a parameter
        numbers.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        //Sorted taking static Comparator method reverseOrder which is of type Comparator
        //Sorted returns a Stream
        Integer collect1 = numbers.stream().sorted(Comparator.<Integer>reverseOrder()).collect(Collectors.summingInt(t -> t + 2));

        numbers.stream().sorted(Comparator.<Integer>reverseOrder()).collect(Collectors.summingInt(t -> t + 2));

        System.out.println("ddd");
    }
}
