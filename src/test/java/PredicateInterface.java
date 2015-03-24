import org.junit.Test;

import java.util.function.Predicate;

/**
 * Using Built in Lambda Types
 * Develop code that uses Function interface
 */
public class PredicateInterface {


    @Test
    public void test(){

        //Predicate interface
        //boolean test(T t);

        Predicate<String> predicate = xStr -> xStr.contains("foo");

        Predicate<Boolean> predicate1 = x -> x == true;

        System.out.println(predicate1.test(false));

        System.out.println(predicate.test("foodd"));
    }
}
