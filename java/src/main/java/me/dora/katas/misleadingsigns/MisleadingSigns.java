package me.dora.katas.misleadingsigns;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MisleadingSigns {
        public boolean gaslighting(String shirtWord, String givenWord, char[] knownLetters) {
                List<Character> differ = new ArrayList<>();
                Stream<Character> streamOfChars = IntStream
                        .range(0, knownLetters.length)
                        .mapToObj(c -> knownLetters[c]);
                List<Character> knownCharacters = streamOfChars.toList();
                char[] shirtChars = shirtWord.toCharArray();
                char[] givenChars = givenWord.toCharArray();

                boolean amIFooled = false;
                for (int i = 0; i < shirtChars.length; i++) {
                        if (knownCharacters.contains(shirtChars[i]) || knownCharacters.contains(givenChars[i])) {
                                if (shirtChars[i] == givenChars[i]) {
                                        amIFooled = false;
                                } else {
                                        amIFooled = true;
                                        break;
                                }
                        }
                }
                return amIFooled;
        }
}
