package collection.improvements;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CollectionReplaceAll {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        ArrayList<Integer> num = new ArrayList(numbers);

        //Notice no returned boolean unlike Collection.RemoveIf
        num.replaceAll(myInt -> {
            if (myInt == 5) return 21;
            return myInt;
        });

        //Wont compile, must return same type, UnaryOperator
//        num.replaceAll(myInt -> {
//            if (myInt == 5) return "";
//            return myInt;
//        });

        System.out.println(num);

    }
}