package me.dora.katas.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    Reverse reverse = new Reverse();


    @ParameterizedTest
    @CsvSource({
            "oHlel, Hello",
            "504132,012345",
            "IH, HI"
    })
    void funReverse(String expected, String s) {
        String result = reverse.reverse(s);

        Assertions.assertEquals(expected, result);

    }
}