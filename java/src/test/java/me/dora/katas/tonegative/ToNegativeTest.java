package me.dora.katas.tonegative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToNegativeTest {

    ToNegative toNegative = new ToNegative();

    @Test
    void makeNegative() {

        int result = toNegative.makeNegative(-8);

        int expected = -8;

        Assertions.assertEquals(expected, result);
    }
}