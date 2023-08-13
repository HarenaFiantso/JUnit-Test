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

    @Test
    void testEmptyIntervals() {
        int[][] intervals = {};
        Assertions.assertEquals(0, SumIntervals.sumIntervals(intervals));
    }

    @Test
    void testNonOverlappingIntervals() {
        int[][] intervals = {{1, 4}, {5, 8}, {9, 12}};
        Assertions.assertEquals(9, SumIntervals.sumIntervals(intervals));
    }
    @Test
    void testOverlappingIntervalsWithGaps() {
        int[][] intervals = {{1, 4}, {6, 9}, {11, 14}};
        Assertions.assertEquals(9, SumIntervals.sumIntervals(intervals));
    }
}
