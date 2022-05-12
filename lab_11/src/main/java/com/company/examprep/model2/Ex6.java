package com.company.examprep.model2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex6 {
    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(10);
        mySet.add(1);
        mySet.add(100);
        System.out.println(mySet);
    }
}
