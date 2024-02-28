package me.dora.katas.nthpower;

public class NthPower {

    public int modifiedSum(int[] array, int power) {
        int sum = 0;
        double sumOfPower = 0;
        for (int number : array) {
            sum += number;
            sumOfPower += Math.pow(number, power);
        }
        return (int) (sumOfPower - sum);
    }
}

