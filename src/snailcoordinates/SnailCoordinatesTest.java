package snailcoordinates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnailCoordinatesTest {

    @Test
    void shouldGetFirstCoordinateSum() {
        double actual = SnailCoordinates.getSumOfCoordinates(1);
        assertEquals(0, actual);
    }

    @Test
    void shouldGetSecondCoordinateSum() {
        double actual = SnailCoordinates.getSumOfCoordinates(2);
        assertEquals(1, actual);
    }

    @Test
    void shouldGetThirdCoordinateSum() {
        double actual = SnailCoordinates.getSumOfCoordinates(3);
        assertEquals(2, actual);
    }

    @Test
    void shouldGetFifthCoordinateSum() {
        double actual = SnailCoordinates.getSumOfCoordinates(5);
        assertEquals(-2, actual);
    }

    @Test
    void shouldGetForteenthCoordinateSum() {
        double actual = SnailCoordinates.getSumOfCoordinates(14);
        assertEquals(1, actual);
    }
}