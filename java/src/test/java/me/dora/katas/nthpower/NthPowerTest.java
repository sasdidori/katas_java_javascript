package me.dora.katas.nthpower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NthPowerTest {

    NthPower nthPower = new NthPower();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(30, new int[]{1, 2, 3}, 3),
                Arguments.of(0, new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void modifiedSum(int expected, int[] array, int power) {
        int result = nthPower.modifiedSum(array, power);

        Assertions.assertEquals(expected, result);
    }
}