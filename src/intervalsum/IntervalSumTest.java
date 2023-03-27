package intervalsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntervalSumTest {

    @Test
    void shouldGetSomeInterval_one() {
        int[][] intervals = {
                {1, 2},
                {6, 10},
                {11, 15}
        };
        int actual = IntervalSum.getSumOfIntervals(intervals);
        assertEquals(9, actual);
    }

    @Test
    void shouldGetSomeInterval_two() {
        int[][] intervals = {
                {1, 4},
                {7, 10},
                {3, 5}
        };
        int actual = IntervalSum.getSumOfIntervals(intervals);
        assertEquals(7, actual);
    }

    @Test
    void shouldGetSomeInterval_three() {
        int[][] intervals = {
                {1, 5},
                {10, 20},
                {1, 6},
                {16, 19},
                {5, 11},
        };
        int actual = IntervalSum.getSumOfIntervals(intervals);
        assertEquals(19, actual);
    }

    @Test
    void shouldGetSomeInterval_four() {
        int[][] intervals = {
                {0, 20},
                {-100000000, 10},
                {30, 40}
        };
        int actual = IntervalSum.getSumOfIntervals(intervals);
        assertEquals(100000030, actual);
    }

}