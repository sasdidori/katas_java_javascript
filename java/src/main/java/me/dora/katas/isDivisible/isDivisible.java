package me.dora.katas.isDivisible;

import java.util.List;

public class isDivisible {
    public boolean iSDivisible(int... arguments) {
        if (arguments.length == 1) {
            return true;
        }
        for (int i = 1; i < arguments.length; i++) {
            if (arguments[0] % arguments[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

