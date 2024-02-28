package me.dora.katas.squareandsum;

public class SquareAndSum {

    public int squareSum(int[] n) {
        int sumSquare = 0;
        for (int i = 0; i < n.length; i++) {
            sumSquare = sumSquare + (int) Math.pow(n[i], 2);
        }
        return sumSquare;
    }
}
