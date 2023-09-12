package romannumeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static romannumeral.RomanNumeralDecoder.decodeRoman;

class RomanNumeralDecoderTest {

    @Test
    void shouldSort_snailSorted() {
        assertEquals(21, decodeRoman("XXI"));
        assertEquals(1, decodeRoman("I"));
        assertEquals(4, decodeRoman("IV"));
        assertEquals(2008, decodeRoman("MMVIII"));
        assertEquals(1666, decodeRoman("MDCLXVI"));
    }
}