package com.correction;

import java.util.HashSet;

public class ArrayComparison {
    public static void main(String[] args) {
        int a[] = {10, 22, 33, 40, 5};
        int b[] = {2, 3, 10, 0, 5};
        HashSet set = new HashSet();
        for (int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }
        for (int i = 0; i < a.length; i++) {
            if (!set.contains(a[i])) {
                System.out.print(" " + a[i]);
            }
        }
    }
}
