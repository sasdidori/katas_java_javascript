package me.dora.katas.terminalgame;

public class MoveCalculator {
    public int position = 3;
    public int roll = 4;

    public int move(int position, int roll) {
        int newPosition = position + roll * 2;
        return newPosition;
    }
}
