package calculations;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CountMethod {

    @Test
    public void test(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        numbers.stream().count();

        long one = numbers.stream().filter(str -> !str.equals("one")).count();

        System.out.println(one);
    }
}
