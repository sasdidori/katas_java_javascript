package me.dora.katas.smallenough;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallEnoughTest {

    SmallEnough smallEnough = new SmallEnough();
    int[] a = {1, 4, 38, 520, 29};
    int limit = 50;

    @Test
    void smallEnough() {
        boolean expected = false;
        boolean result = smallEnough.smallEnoughMethod(a, limit);
        Assertions.assertEquals(expected, result);
    }
}