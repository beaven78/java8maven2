package calculations;

import org.junit.Test;

import java.util.*;

/**
 * 
 */
public class SumCount {

    @Test
    public void test(){

        List<Integer> numbers = Arrays.asList(1, 5, 2, 5, 7, 9, 3);

        int sum = numbers.stream().mapToInt(myInt -> myInt).sum();

        Optional<Integer> max2 = numbers.stream().min(Comparator.<Integer>reverseOrder());

        assert(true);

        List<Long> longs = Arrays.asList(1L, 5L, 2L, 5L, 7L, 9L, 3L);

        long sum1 = longs.stream().mapToLong(myLong -> myLong).sum();

        LongSummaryStatistics longSummaryStatistics = longs.stream().mapToLong(myLong -> myLong).summaryStatistics();

        longSummaryStatistics.getAverage();
        longSummaryStatistics.getCount();
        longSummaryStatistics.getMax();
        longSummaryStatistics.getMin();
        longSummaryStatistics.getSum();

        System.out.print(sum1);
    }
}
