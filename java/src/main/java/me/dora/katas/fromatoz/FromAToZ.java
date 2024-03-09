package me.dora.katas.fromatoz;

import java.util.List;

public class FromAToZ {

    public String gimmeTheLetters(String s) {
        List<String> alphabet = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        String[] argument = s.toLowerCase().split("-");

        String first = argument[0];
        String last = argument[1];
        int indexOfFirst = alphabet.indexOf(first);
        int indexOfLast = alphabet.indexOf(last);
        List<String> returnedLetterList = alphabet.subList(indexOfFirst, indexOfLast + 1);

        String returnedLetters = String.join("", returnedLetterList);

        char charArg = s.charAt(0);
        boolean isUpperCase = Character.isUpperCase(charArg);
        if (isUpperCase) {
            returnedLetters = returnedLetters.toUpperCase();
        }
        System.out.println(returnedLetters);
        return returnedLetters;
    }
}


