package com.company.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("ceva mai lung");
        myList.add("altceva");
        myList.add("si inca una");
        myList.add("si inca una");

        List<String> myList2 = List.of("mouse", "rat", "horse");
        List<String> myList3 = Arrays.asList("one", "two");
        List<String> myList4 = Collections.singletonList("dog");

//        myList.add("cat");
//        myList2.add("cat");
//        myList3.add("cat");
//        myList4.add("cat");

//        System.out.println(myList);
//        System.out.println(myList2);
//        System.out.println(myList3);
//        System.out.println(myList4);

        String rat = myList2.get(1);
//        myList2.remove(1);

//        myList.remove(0);

//        System.out.println(rat);
//        System.out.println(myList3);

//        myList.sort(Comparator.naturalOrder());
//        Collections.sort(myList);
//
//        System.out.println(myList);
//
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
//        myList.sort(Comparator.comparingInt(String::length));
//        System.out.println(myList);

//        int result = Collections.binarySearch(myList, "ceva mai lung");
//        System.out.println(result);

//        int index = myList.indexOf("altceva");
//        System.out.println(index);

//        System.out.println(myList.contains(new String("altceva")));

        myList.set(1, "o chestie");
        myList.add(1, "o noua chestie");
        System.out.println(myList);

        for (String animal : myList2) {
            System.out.println(animal);
        }

        myList2.forEach(System.out::println);
    }
}
