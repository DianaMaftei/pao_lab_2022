package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anastasia");
        names.add("Diana");
        names.add("Dorian");

//        for (String name : names) {
//            if ("Anastasia".equals(name)) {
//                names.remove(name);
//            }
//        }
//
//        Iterator<String> iterator = names.iterator();
//        while(iterator.hasNext()) {
//            if ("Dorian".equals(iterator.next())) {
//                iterator.remove();
//            }
//        }

//        Predicate<String> myPredicate = name -> "Dorian".equals(name);

        names.removeIf(name -> "Dorian".equals(name));
        System.out.println(names);
    }
}
