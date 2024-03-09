package me.dora.katas.suzukiclimbs;

import java.util.Arrays;
import java.util.stream.Stream;

public class SuzukiClimbs {
    public long stairsIn20(int[][] boxes) {
        long result = 0;
        for (int[] box : boxes) {
            for (int paper : box) {
                result += paper;
            }
        }
        return result * 20;
    }

    public long stairsIn20Stream(int[][] boxes) {
        return Stream.of(boxes)
                .flatMapToInt(Arrays::stream)
                .sum() * 20L;

    }
}
