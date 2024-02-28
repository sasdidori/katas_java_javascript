package me.dora.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PractiseTest {

    Practice practice = new Practice();



    @Test
    void getMessage() {
        String message = practice.getMessage();

        Assertions.assertEquals("Hi!", message);
    }
}