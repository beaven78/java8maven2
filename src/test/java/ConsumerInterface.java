import org.apache.commons.collections.ListUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Using Built in Lambda Types
 * Develop code that uses Consumer interface
 */
public class ConsumerInterface {

    @Test
    public void test(){

        List<String> numbers = Arrays.asList("one", "two", "three");

        Consumer<String> consumer = xStr -> System.out.println(xStr);

        //Won't compile no generic defined
        //Consumer consumer1 = () ->  System.out.println("ddd");

        //Defined consumer prior to use
        numbers.stream().forEach(consumer);

        //Define consumer in stream
        numbers.stream().forEach(xStr ->  System.out.println(xStr));

    }
}
