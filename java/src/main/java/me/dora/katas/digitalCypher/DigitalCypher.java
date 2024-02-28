package me.dora.katas.digitalCypher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalCypher {
    Map<String, Integer> alphabet = new HashMap<String, Integer>() {{
        put("a", 1);
        put("b", 2);
        put("c", 3);
        put("d", 4);
        put("e", 5);
        put("f", 6);
        put("g", 7);
        put("h", 8);
        put("i", 9);
        put("j", 10);
        put("k", 11);
        put("l", 12);
        put("m", 13);
        put("n", 14);
        put("o", 15);
        put("p", 16);
        put("q", 17);
        put("r", 18);
        put("s", 19);
        put("t", 20);
        put("u", 21);
        put("v", 22);
        put("w", 23);
        put("x", 24);
        put("y", 25);
        put("z", 26);
    }};

    public int[] encode(String message, int key) {
        String[] splittedWord = message.split("");
        List<Integer> encrypted = new ArrayList<>();
        for (int i = 0; i < splittedWord.length; i++) {
            String currentLetter = splittedWord[i];
            int currentNumber = alphabet.get(currentLetter);
            encrypted.add(currentNumber);
        }
        String numbersToString = String.valueOf(key);
        List<Integer> digits = numbersToString.chars().map(Character::getNumericValue).boxed().toList();
        int[] result = new int[encrypted.size()];
        for (int i = 0; i < encrypted.size(); i++) {
            int number = encrypted.get(i);
            int digitIndex = i % digits.size();
            int digit = digits.get(digitIndex);
            int sum = number + digit;
            result[i] = sum;
        }
        return result;
    }
}
