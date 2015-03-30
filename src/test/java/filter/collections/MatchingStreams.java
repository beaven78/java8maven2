package filter.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 */
public class MatchingStreams {

    @Test
    public void test(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        Optional<String> first = numbers.stream().findFirst();

        if (first.isPresent()){
            System.out.println(first.get());
        }

    }

    @Test
    public void test2(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        Optional<String> any = numbers.stream().findAny();

        if (any.isPresent()){
            System.out.println(any.get());
        }
    }

    @Test
    public void test3(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        Assert.assertTrue(numbers.stream().anyMatch(str -> str.contains("o")));
    }

    @Test
    public void test4(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        Assert.assertTrue(numbers.stream().allMatch(myStr -> myStr.length() > 2));
    }

    @Test
    public void test5(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        Assert.assertTrue(numbers.stream().noneMatch(str -> str.contains("d")));
    }
}
