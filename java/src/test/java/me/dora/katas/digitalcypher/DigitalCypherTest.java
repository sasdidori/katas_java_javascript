package me.dora.katas.digitalcypher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DigitalCypherTest {

    DigitalCypher digitalCypher = new DigitalCypher();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{20, 12, 18, 30, 21}, "scout", 1939)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void encode(int[] expected, String message, int key) {
        int[] result = digitalCypher.encode(message, key);
        Assertions.assertArrayEquals(expected, result);
    }
}