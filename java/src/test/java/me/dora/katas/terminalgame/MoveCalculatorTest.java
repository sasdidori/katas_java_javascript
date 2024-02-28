package me.dora.katas.terminalgame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveCalculatorTest {

    MoveCalculator movecalculator = new MoveCalculator();
    int result = movecalculator.move(movecalculator.position, movecalculator.roll);

    @Test
    void move() {
        Assertions.assertEquals(11, result);
    }
}