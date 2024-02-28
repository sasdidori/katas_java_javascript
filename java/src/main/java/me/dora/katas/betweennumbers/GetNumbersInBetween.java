package me.dora.katas.betweennumbers;

public class GetNumbersInBetween {

    public int[] between(int a, int b) {
        int[] array = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            array[i - a] = i;
        }
        return array;
    }
}
