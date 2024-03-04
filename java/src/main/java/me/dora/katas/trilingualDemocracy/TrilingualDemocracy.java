package me.dora.katas.trilingualDemocracy;

public class TrilingualDemocracy {

    char[] availableLanguages = {'D', 'F', 'I', 'K'};

    public char trilingualDemocracy(char[] languages) {
        if (languages[0] == languages[1] && languages[0] == languages[2]) {
            return languages[0];
        } else if (languages[0] == languages[1]) {
            return languages[2];
        } else if (languages[1] == languages[2]) {
            return languages[0];
        } else if (languages[2] == languages[0]) {
            return languages[1];
        }
        char first = languages[0], second = languages[1], third = languages[2];
        for (char language : availableLanguages) {
            if (language != first && language != second && language != third) {
                return language;
            }
        }
        throw new IllegalStateException();
    }
}

