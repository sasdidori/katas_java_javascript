package me.dora.katas.misleadingsigns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MisleadingSignsTest {

    MisleadingSigns misleadingSigns = new MisleadingSigns();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "boy", "bad", new char[]{'o'}),
                Arguments.of(false, "bad", "boy", new char[]{'b'}),
                Arguments.of(true, "bad", "boy", new char[]{'b', 'd'}),
                Arguments.of(false, "bad", "boy", new char[]{'b'}),
                Arguments.of(false, "bad", "bad", new char[]{'b', 'a', 'd'}),
                Arguments.of(false, "handsome", "hands-on", new char[]{'a', 'h'}),
                Arguments.of(true, "hands-on", "handsome", new char[]{'n'}),
                Arguments.of(false, "hands-on", "handsome", new char[]{'p'}),
                Arguments.of(true, "ele", "eli", new char[]{'e'})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void gaslighting(boolean expected, String shirtWord, String myWord, char[] knownLetters) {
        boolean result = misleadingSigns.gaslighting(shirtWord, myWord, knownLetters);

        Assertions.assertEquals(expected, result);
    }
}