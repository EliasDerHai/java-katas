package romannumeral;

public class RomanNumeralDecoder {

    static int decodeRoman(String romanNumbers) {
        char[] romanChars = romanNumbers.toUpperCase().toCharArray();

        int lastCharVal = 0;
        int total = 0;

        for (char c : romanChars) {
            int currentValue = getNumeralValue(c);

            if (currentValue > lastCharVal) {
                total -= lastCharVal;
            } else {
                total += lastCharVal;
            }

            lastCharVal = currentValue;
        }
        total += lastCharVal;

        return total;
    }

    private static int getNumeralValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1_000;
            default:
                throw new IllegalArgumentException("Invalid symbol");
        }
    }
}
