package me.dora.katas.listfiltering;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListFilteringTest {

    ListFiltering listFiltering = new ListFiltering();

    public static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(List.of(),List.of()),
                Arguments.of(List.of(4, 10, 5),List.of("a", 4, "g", 10, 5, "c")),
                Arguments.of(List.of(),List.of("a", "h")),
                Arguments.of(List.of(1, 3, 5),List.of(1, 3, 5))
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void filterList(List<Object> expected, List<Object> parameters) {
        List<Object> result = listFiltering.filterList(parameters);

        Assertions.assertIterableEquals(expected, result);
    }
}