package com.practice.som.collections.Queue;

import java.util.Comparator;

public class QueueStringComparator implements Comparator<String> {

    @Override
    public int compare(String v1, String v2) {
        return Integer.compare(v1.length(),v2.length());
    }
}
