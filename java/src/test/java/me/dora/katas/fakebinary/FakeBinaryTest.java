package me.dora.katas.fakebinary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FakeBinaryTest {

    FakeBinary fakeBinary = new FakeBinary();

    @Test
    void fakeBin() {
        String result = fakeBinary.fakeBin("72");
        String expected = "10";
        Assertions.assertEquals("10", result);
    }
}