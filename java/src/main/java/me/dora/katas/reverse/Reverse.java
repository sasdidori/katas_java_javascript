package me.dora.katas.reverse;

public class Reverse {
    public String reverse(String input) {
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            for (int k = i, j = characters.length - 1; k < j; k++, j--) {
                char temp = characters[k];
                characters[k] = characters[j];
                characters[j] = temp;
                System.out.println(characters);
            }
        }

        return new String(characters);
    }
}
