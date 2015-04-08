package collection.improvements;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CollectionRemoveIf {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        ArrayList<Integer> num = new ArrayList(numbers);

        boolean b = num.removeIf(myPara -> myPara == 5);

        ArrayList num2 = new ArrayList(numbers);

        //boolean b2 = num2.removeIf(myPara -> myPara == 5); //Won't work because ArrayList num2 doesn't have generic so no type can be infered.

        if (b) {
            System.out.println(num);
        } else {
            System.out.println("No elements were removed");
        }

    }
}