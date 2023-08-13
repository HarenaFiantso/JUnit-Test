import org.example.SumIntervals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumIntervalsTests {
    @Test
    void testWithSingleInterval() {
        int[][] intervals = {{1, 5}};
        Assertions.assertEquals(4, SumIntervals.sumIntervals(intervals));
    }

    @Test
    void testOverlappingIntervals() {
        int[][] intervals = {{1, 4}, {7, 10}, {3, 5}};
        Assertions.assertEquals(7, SumIntervals.sumIntervals(intervals));
    }

    @Test
    void testComplexIntervals() {
        int[][] intervals = {{1, 5}, {12, 15}, {3, 10}, {13, 18}};
        Assertions.assertEquals(15, SumIntervals.sumIntervals(intervals));
    }
}
