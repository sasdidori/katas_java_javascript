package me.dora.katas.countpositivessumnegatives;

import java.util.ArrayList;

public class CountPositivesSumNegatives {
    public int[] countPositivesSumNegatives(int[] input) {
        int countOfPositives = 0;
        int sumOfNegatives = 0;

        for (int j = 0; j < input.length; j++) {
            if (input[j] > 0) {
                countOfPositives++;
            } else {
                sumOfNegatives += input[j];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(countOfPositives);
        list.add(sumOfNegatives);

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
