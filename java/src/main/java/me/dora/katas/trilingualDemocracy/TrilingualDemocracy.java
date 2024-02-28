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
        char[] copiedAvailableLanguageArray = new char[4];
        System.arraycopy(availableLanguages, 0, copiedAvailableLanguageArray, 0, 4);

        return '?';
    }
}
