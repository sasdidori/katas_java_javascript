package me.dora.katas.sumpositives;

public class PositiveNumberCalculator {

    public int[] arr = {1, -2, 3, 4};

    public int sum(int[] arr) {
        int sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfNumbers += arr[i];
            }
        }
        return sumOfNumbers;
    }
}
