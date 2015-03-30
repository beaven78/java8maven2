package filter.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 */
public class ForEachStreams {

    @Test
    public void test(){
        List<String> numbers = Arrays.asList("one", "two", "three");

        numbers.stream().filter(x -> x.equals("foo")).count();

        numbers.stream().filter(x -> x.equals("foo"));

        Object[] ffs = numbers.stream().map(xStr -> xStr.equals("ff")).toArray();

        OptionalDouble average = numbers.stream().mapToInt(str -> str.hashCode()).average();

        numbers.stream().forEach(myString -> emptyMethod());
        numbers.stream().forEach(myString -> emptyMethodNoReturn());
    }

    private void emptyMethodNoReturn(){}
    private int emptyMethod(){return 1;}
}
