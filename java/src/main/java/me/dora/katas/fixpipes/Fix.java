package me.dora.katas.fixpipes;

import java.util.ArrayList;
import java.util.List;

public class Fix {
    public int[] pipeFix(int[] numbers) {
        if (numbers.length == 0) {
            return new int[]{};
        }
        List<Integer> result = new ArrayList<>();
        int lastNumber = numbers[numbers.length - 1];
        result.add(numbers[0]);
        for (int i = numbers[0]; i < lastNumber; i++) {
            int currentNumber = i + 1;
            result.add(currentNumber);
        }
        return result.stream().mapToInt(n -> n).toArray();
    }
}
