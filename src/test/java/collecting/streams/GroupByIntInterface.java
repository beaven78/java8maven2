package collecting.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

/**
 *
 */
public class GroupByIntInterface {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        //With this group by the maps key is an Integer thats because the Function lambda returns an Integer
        Map<Integer, List<Integer>> collect = numbers.stream().collect(groupingBy(number -> number + 5));

        //Notice in this instance the return maps key is a boolean, thats because the Function (lambda interface) returns a boolean
        //Function signature -> <R> apply <T>
        Map<Boolean, List<Integer>> collect1 = numbers.stream().collect(groupingBy(number -> number > 4));

        System.out.println(collect);  //Prints {6=[1], 7=[2], 8=[3], 10=[5, 5], 12=[7], 14=[9]}

        System.out.println(collect1);
    }
}