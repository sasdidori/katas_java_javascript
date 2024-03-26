package me.dora.katas.catsandshelves;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CatsAndShelvesTest {

    CatsAndShelves catsAndShelves = new CatsAndShelves();


    @ParameterizedTest
    @CsvSource({
            "2, 1, 5",
            "1, 2, 5",
            "12, 3, 35",
            "7, 1, 20"

    })
    void solution(int expected, int start, int finish) {
        int result = catsAndShelves.solution(start, finish);

        Assertions.assertEquals(expected, result);
    }
}