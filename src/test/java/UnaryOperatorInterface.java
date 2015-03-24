import org.junit.Test;

import java.util.function.UnaryOperator;

/**
 * Using Built in Lambda Types
 * Develop code that uses UnaryOperator interface
 */
public class UnaryOperatorInterface {

    @Test
    public void test(){

        //UnaryOperator extends Fucntion interface
        //R apply(T t);

        UnaryOperator<String> unaryOperator = xStr -> xStr.concat("foo");

        String bar = unaryOperator.apply("bar");

        System.out.println(bar);

        //Notice the infered type of String allows you to call concat
        test2(xstr -> xstr.concat("foo"));
        test2(xstr -> xstr.concat("tea"));

        //Would fail because there is no generic on the test3 method
        //test3(xstr -> xstr.concat("tea"));

    }

    public void test3(UnaryOperator unaryOperator){

        System.out.println(unaryOperator.apply("cheat"));
        System.out.println(unaryOperator.apply("box"));
    }

    public void test2(UnaryOperator<String> unaryOperator){

        System.out.println(unaryOperator.apply("cheat"));
        System.out.println(unaryOperator.apply("box"));
    }

}

