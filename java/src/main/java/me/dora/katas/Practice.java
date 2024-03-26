package me.dora.katas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Practice {

    public String getMessage() {
        return "Hi!";
    }

    public static void main(String[] args) {
        int methodcall = solution(1, 20 );
        System.out.println(methodcall);

    }

    public static int solution(int start, int finish) {
        int shelves = finish - start;
        int stepsWith3 = shelves / 3;
        int stepsWith1 = shelves - stepsWith3 * 3;
        return stepsWith1 + stepsWith3;
    }
}
