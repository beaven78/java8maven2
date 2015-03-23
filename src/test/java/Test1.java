import org.junit.Test;

import java.util.function.Function;

/**
 * Created by stefos on 19/03/2015.
 */
public class Test1 {

    @Test
    public void lamdbaTest(){

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        r2.run();

    }
}
