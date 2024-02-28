package me.dora.katas.addnumbersinarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddNumbersTest {

    AddNumbers addNumbers = new AddNumbers();

    @Test
    void trouble() {
        int[] x = {2, 3, 5, 8};
        int t = 5;
        int[] result = addNumbers.trouble(x, t);
        int[] expected = {2, 5, 8, 14};

        Assertions.assertArrayEquals(expected, result);
    }
}