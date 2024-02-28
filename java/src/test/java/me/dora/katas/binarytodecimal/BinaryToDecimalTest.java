package me.dora.katas.binarytodecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryToDecimalTest {

    BinaryToDecimal binaryToDecimal = new BinaryToDecimal();

    @Test
    void binaryToDecimal() {

        int result = binaryToDecimal.binaryToDecimal("01011011");
        int expectedDecimal = 91;

        Assertions.assertEquals(expectedDecimal, result);
    }
}