package me.dora.katas.sortedarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortedArray {

    public static int[] mergeArrays(int[] first, int[] second) {

        //merge 2 arrays
        int[] mergedArr = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length) {
            mergedArr[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length) {
            mergedArr[k] = second[j];
            k++;
            j++;
        }

        //remove duplicates

        Set<Integer> setWithNoDupes = new HashSet<>();

        for (int l = 0; l < mergedArr.length; l++) {
            setWithNoDupes.add(mergedArr[l]);

        }

        Iterator<Integer> it = setWithNoDupes.iterator();
        int[] mergedArrayWithNoDupes = new int[setWithNoDupes.size()];
        int n = 0;

        while (it.hasNext()) {
            mergedArrayWithNoDupes[n] = it.next();
            n++;
        }

        //sort the array of integers
        Arrays.sort(mergedArrayWithNoDupes);
        return mergedArrayWithNoDupes;
    }
}
