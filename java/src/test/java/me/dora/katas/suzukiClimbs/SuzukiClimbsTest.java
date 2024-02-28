package me.dora.katas.suzukiClimbs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SuzukiClimbsTest {

    SuzukiClimbs suzukiClimbs = new SuzukiClimbs();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, new int[][]{new int[]{0, 0}, new int[]{0, 0}}),
                Arguments.of(80, new int[][]{new int[]{1, 1}, new int[]{1, 1}})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void stairsIn20(long expected, int[][] stairs) {
        long result = suzukiClimbs.stairsIn20(stairs);

        Assertions.assertEquals(expected, result);
    }
}