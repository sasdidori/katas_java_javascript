package me.dora.katas.smallestinarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestInArrayTest {

    SmallestInArray smallestInArray = new SmallestInArray();

    @Test
    void findSmallestInt() {
        int result = smallestInArray.findSmallestInt(new int[]{12, 4, 5, 3});
        int expected = 3;

        Assertions.assertEquals(expected, result);
    }
}