package com.company.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        String[] strings = new String[2];
        int[] ints = new int[2];

        strings[0] = "ceva";
        strings[1] = "altceva";
//        strings[2] = "alt altceva";
        System.out.println(Arrays.toString(strings));

        ArrayList<String> newStrings = new ArrayList<>(100);
        List<Integer> newIntegers = new ArrayList<>();

        List something = new ArrayList(); // create a list without generics -> add an Integer to it, cast it to String
        something.add(new Integer(3));
        something.add("5436453");

//        Integer myInt = (Integer) something.get(0);
//        Integer myInt2 = (Integer) something.get(1);
//
//        System.out.println(myInt);


        List<String> names = new ArrayList<>();
//        names.add(new Integer(5));

        Box box = new Box();
        box.add("ceva");
        System.out.println(box.getContents());
        box.add(1232);
        System.out.println(box.getContents());
        box.add(Boolean.TRUE);
        System.out.println(box.getContents());

        box.add(3);

        Box<String> stringBox = new Box<>();
        stringBox.add("tralala");
//        stringBox.add(1232);

        Box<Book> book = new Box<>();
        book.add(new Book("How to make friends and influence people"));

        Box<Novel> novel = new Box<>();
        novel.add(new Novel("some novel"));


        addUpperBound(novel);
        addUpperBound(book);
        Box<Object> object = new Box<>();
        object.add(new Object());

//        addUpperBound(object);

//        addLowerBound(novel);
        addLowerBound(book);
        addLowerBound(object);
    }

    private static void addUpperBound(Box<? extends Book> box) {
        System.out.println(box.getContents().getName());
    }

    private static void addLowerBound(Box<? super Book> box) {
        System.out.println(box.getContents().getClass());
    }
}
