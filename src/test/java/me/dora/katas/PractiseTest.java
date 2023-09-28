package me.dora.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PractiseTest {

    Practise practise = new Practise();



    @Test
    void getMessage() {
        String message = practise.getMessage();

        Assertions.assertEquals("Hi!", message);
    }
}