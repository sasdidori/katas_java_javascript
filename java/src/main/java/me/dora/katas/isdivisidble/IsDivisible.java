package me.dora.katas.isdivisidble;

public class IsDivisible {

    public boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) {
            return true;
        }
        return false;
    }
}
