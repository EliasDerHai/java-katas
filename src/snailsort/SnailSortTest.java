package snailsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnailSortTest {

    @Test
    void shouldSort_snailSorted() {
        // Arrange
        int[][] array = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        // Act
        int[] actual = SnailSort.sort(array);
        // Assert
        int[] expectation = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectation, actual);
    }

    @Test
    void shouldSort_snailSorted_whereN4() {
        // Arrange
        int[][] array = {
                {1,  2,   3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10,  9,  8, 7}
        };
        // Act
        int[] actual = SnailSort.sort(array);
        // Assert
        int[] expectation = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        assertArrayEquals(expectation, actual);
    }

    @Test
    void shouldSort_presorted() {
        // Arrange
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Act
        int[] actual = SnailSort.sort(array);
        // Assert
        int[] expectation = {1, 2, 3, 4, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(expectation, actual);
    }
}