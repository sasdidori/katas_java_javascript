package me.dora.katas.listfiltering;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public List<Object> filterList(final List<Object> list) {
        /*
        List<Object> filtered = new ArrayList<>();
        for (Object object : list) {
            if (object instanceof Integer) {
                filtered.add(object);
            }
        }
        return filtered;

         */

        return list.stream()
                .filter(element -> element instanceof Integer)
                .toList();
    }
}

