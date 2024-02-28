package me.dora.katas.fixPipes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class fixTest {

    Fix fix = new Fix();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 6, 7, 8, 9}, new int[]{3, 6, 9}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{-3, 4, 10, 12})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void pipeFix(int[] expected, int[] array) {
        int[] result = fix.pipeFix(array);

        Assertions.assertArrayEquals(expected, result);
    }
}