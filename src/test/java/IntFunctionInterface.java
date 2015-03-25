import org.junit.Test;

import java.util.function.IntFunction;

/**
 * Develop the code that use primitive and binary variations of base interfaces
 */
public class IntFunctionInterface {

    @Test
    public void test(){

        IntFunction<String> intFunction = myInt -> "foobar" + myInt;

        System.out.println(intFunction.apply(44));

        //Defeats the point of having a primitive int type FunctionalInterface
        System.out.println(intFunction.apply(new Integer(44)));
    }
}
