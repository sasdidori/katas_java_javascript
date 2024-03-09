package me.dora.katas.squareup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SquareUpTest {

    SquareUp squareUp = new SquareUp();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{0, 1, 2, 1}, 2),
                Arguments.of(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void squareUp(int[] expected, int number) {
        int[] result = squareUp.squareUp(number);

        Assertions.assertArrayEquals(expected, result);
    }
}