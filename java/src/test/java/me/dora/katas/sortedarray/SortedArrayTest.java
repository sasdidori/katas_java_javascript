package me.dora.katas.sortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedArrayTest {

    SortedArray sortedArray = new SortedArray();

    @Test
    void mergeArrays() {
        int[] first = {1, 6, 3};
        int[] second = {9, 2, 3, 1};
        int[] expected = {1, 2, 3, 6, 9};
        int[] result = sortedArray.mergeArrays(first, second);
        Assertions.assertArrayEquals(expected, result);
    }
}