package me.dora.katas.trilingualDemocracy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TrilingualDemocracyTest {

    TrilingualDemocracy trilingualDemocracy = new TrilingualDemocracy();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of('F', new char[]{'F', 'F', 'F'}),
                Arguments.of('K', new char[]{'K', 'F', 'F'}),
                Arguments.of('K', new char[]{'I', 'F', 'D'})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void trilingualDemocracy(char expected, char[] parameters) {
        char result = trilingualDemocracy.trilingualDemocracy(parameters);

        Assertions.assertEquals(expected, result);
    }
}