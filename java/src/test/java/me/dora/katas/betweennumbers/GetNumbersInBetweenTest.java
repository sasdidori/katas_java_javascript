package me.dora.katas.betweennumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNumbersInBetweenTest {

    GetNumbersInBetween getNumbersInBetween = new GetNumbersInBetween();

    @Test
    void between() {

        int [] result = getNumbersInBetween.between(2, 8);
        int [] expected = {2,3,4,5,6,7,8};
        Assertions.assertArrayEquals(expected, result);

    }
}