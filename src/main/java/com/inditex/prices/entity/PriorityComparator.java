package com.inditex.prices.entity;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Price> {

    public int compare(Price c1, Price c2) {
        return c2.getPriority().compareTo(c1.getPriority());
    }
}
