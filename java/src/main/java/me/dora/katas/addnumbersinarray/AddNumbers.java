package me.dora.katas.addnumbersinarray;

import java.util.stream.IntStream;

public class AddNumbers {

    public int[] trouble(int[] x, int t) {
        for (int i = 0; i < x.length; i++) {
            int sum = x[i] + x[i + 1];
            if (sum == t) {
                IntStream.range(0, x.length)
                        .filter(j -> j != 1)
                        .map(j -> x[j])
                        .toArray();
            }
        }
        return x;
    }
}
