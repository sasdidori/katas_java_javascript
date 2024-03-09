package me.dora.katas.squareup;

import java.util.ArrayList;
import java.util.List;

public class SquareUp {

    public int[] squareUp(int limit) {
        List<Integer> numbers = new ArrayList<>();
        for (int sectionNumber = limit; sectionNumber > 0; sectionNumber--) {
            List<Integer> section = new ArrayList<>();
            for (int number = 1; number <= limit; number++) {
                if (number > sectionNumber) {
                    section.add(0, 0);
                } else {
                    section.add(0, number);
                }
            }
            numbers.addAll(0, section);
        }
        return numbers.stream().mapToInt(n -> n).toArray();
    }
}
