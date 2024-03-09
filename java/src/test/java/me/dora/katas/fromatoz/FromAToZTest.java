package me.dora.katas.fromatoz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class FromAToZTest {

    FromAToZ fromAToZ = new FromAToZ();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("AB", "A-B"),
                Arguments.of("ab", "a-b"),
                Arguments.of("ABC", "A-C")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void gimmeTheLetters(String expected, String input) {
        String result = fromAToZ.gimmeTheLetters(input);

        Assertions.assertEquals(expected, result);
    }
}