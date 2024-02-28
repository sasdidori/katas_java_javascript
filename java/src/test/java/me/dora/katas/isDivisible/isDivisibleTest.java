package me.dora.katas.isDivisible;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class isDivisibleTest {

    private final isDivisible isDivisible = new isDivisible();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, new int[]{1}),
                Arguments.of(true, new int[]{1, 1}),
                Arguments.of(true, new int[]{2, 1}),
                Arguments.of(true, new int[]{2, 2}),
                Arguments.of(false, new int[]{2, 3}),
                Arguments.of(true, new int[]{2, 1, 2}),
                Arguments.of(false, new int[]{2, 1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void iSDivisible(boolean expected, int... values) {
        boolean result = isDivisible.iSDivisible(values);

        Assertions.assertEquals(expected, result);
    }
}