package me.dora.katas.countByX;


import java.util.ArrayList;

public class count {

    public int[] countBy(int number1, int number2) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= number2; i++) {
            int number = number1 * i;
            array.add(number);
        }
        return array.stream()
                .mapToInt(arr -> arr).toArray();
    }

}
