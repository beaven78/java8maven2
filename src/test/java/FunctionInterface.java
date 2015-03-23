import org.junit.Test;

import java.util.function.Function;

/**
 * Using Built in Lambda Types
 * Develop code that uses Function interface
 */
public class FunctionInterface {

    @Test
    public void test(){

        //Fucntion interface
        //R apply(T t);

        //Takes a single parameter 'x' and returns the result of x + 3 as an Integer
        Function<Integer, Integer> function = x -> x + 3;

        //Takes a single paramter 'y' and returns a boolean indicating if 'y' is greater than 5
        Function<Integer, Boolean> function2 = y -> y > 5;

        //Takes a string and returns a custom object Test1
        Function<String, Test1> function3 = z -> {
            if (z.equals("terd")) return new Test1();
            else return null;
        };

        //Singular line doesn't require brackets {}
        Function<String, Test1> function4 = z -> new Test1();

        //Won't compile because we haven't applied generics to Function
        Function function5 = x -> x + 1;
    }
}
