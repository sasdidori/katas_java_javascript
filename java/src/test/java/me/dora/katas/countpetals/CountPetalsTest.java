package me.dora.katas.countpetals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountPetalsTest {
    CountPetals2 countPetals = new CountPetals2();

    @ParameterizedTest
    @CsvSource({
            "I love you, 1",
            "madly, 5",
            "not at all, 6",
            "I love you, 7",
            "a little, 8",
    })
    void howMuchILoveYou(String expected, int petals) {
        String result = countPetals.howMuchILoveYou(petals);

        Assertions.assertEquals(expected, result);
    }
}