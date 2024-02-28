package me.dora.katas.smallenough;

public class SmallEnough {
    public boolean smallEnoughMethod(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }
        }
        return true;
    }
}
