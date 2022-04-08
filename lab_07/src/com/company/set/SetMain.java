package com.company.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        Set<String> uniques = new HashSet<>();
        uniques.add("one");
        uniques.add("one");
        uniques.add("two");
        uniques.add("three");

        System.out.println(uniques);

        System.out.println(new TreeSet<String>(uniques));


    }
}
