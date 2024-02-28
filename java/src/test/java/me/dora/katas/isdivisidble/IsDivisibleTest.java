package me.dora.katas.isdivisidble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsDivisibleTest {

    IsDivisible isDivisible = new IsDivisible();


    @Test
    void isDivisible() {
        boolean result = isDivisible.isDivisible(899445, 5, 1);

        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }
}