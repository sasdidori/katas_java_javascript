package me.dora.katas.sumpositives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class sumPositivesTest {

    private final sumPositives sumPositives = new sumPositives();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(6, new int[]{1, 2, 3}),
                Arguments.of(6, new int[]{-1, 3, 3}),
                Arguments.of(0, new int[]{}),
                Arguments.of(0, new int[]{0}),
                Arguments.of(0, new int[]{-1, -88, -132}),
                Arguments.of(132, new int[]{-1, -88, 132})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sum(int expected, int[] arr) {
        int result = sumPositives.sum(arr);

        Assertions.assertEquals(expected, result);
    }
}