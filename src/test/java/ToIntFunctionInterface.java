import org.junit.Test;

import java.util.function.ToIntFunction;

/**
 * Develop the code that use primitive and binary variations of base interfaces
 */
public class ToIntFunctionInterface {

    @Test
    public void test(){

        ToIntFunction<String> toIntFunction = myStr -> 4;

        ToIntFunction<String> toIntFunction2 = myStr -> {
            if (myStr.endsWith("foo")){
                return 4;
            }
            return 5;
        };

        int i = toIntFunction2.applyAsInt("444");

        int i1 = toIntFunction.applyAsInt("444");
    }
}
