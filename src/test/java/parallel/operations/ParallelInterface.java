package parallel.operations;

import org.junit.Test;


import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * Created by St on 06/04/2015.
 */
public class ParallelInterface {

    @Test
    public void test(){

        Arrays.asList(1, 5, 2, 5, 7, 9, 3).parallelStream().count();

        int[] intArr = new int[100000000];
        int[] intArrPar = new int[100000000];


        long startTimePar = System.nanoTime();
        Arrays.parallelSetAll(intArrPar, IntUnaryOperator.identity());
        long endTimePar = System.nanoTime();


        long startTime = System.nanoTime();
        Arrays.setAll(intArr, IntUnaryOperator.identity());
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.

        long durationPar = (endTimePar - startTimePar) / 1000000;  //divide by 1000000 to get milliseconds.

        //int sum = Arrays.stream(intArrPar).parallel().sum();

        System.out.println("Duration parralell: " + durationPar);
        System.out.println("Duration sequencial: " + duration);

    }
}
