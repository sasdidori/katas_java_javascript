package me.dora.katas.stringbuilder;

public class StringBuilder {
    String i = "-";
    int index;

    String toCamelCase(String s) {
        boolean isUpperCase = Character.isUpperCase(s.charAt(0));
        for (int index = s.indexOf(i); index >= 0; index = s.indexOf(i, index + 1)) ;

        for (int i = 0; i < s.length(); i++) {
            if (isUpperCase == false) {
                String firstLetter = s.substring(0, 1).toUpperCase();
                //concatenate it with the rest of the string
            }
        }
        s.replaceAll("-", "");
        return s;
    }
}
