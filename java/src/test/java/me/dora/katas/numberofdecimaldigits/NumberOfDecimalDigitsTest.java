package me.dora.katas.numberofdecimaldigits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfDecimalDigitsTest {

    NumberOfDecimalDigits numberOfDecimalDigits = new NumberOfDecimalDigits();

    @Test
    void digits() {

        int result = numberOfDecimalDigits.digits(123456);

        int expected = 6;

        Assertions.assertEquals(result, expected);

    }
}