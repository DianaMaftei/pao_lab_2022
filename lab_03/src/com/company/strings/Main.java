package com.company.strings;

public class Main {

    // - create a String with a literal and by using new -> compare equality ; then use intern() on the 2nd string and compare again
    //- modify the 1st string by calling toUpper() and then printing the string
    //- methods: length, substring, charAt, compareTo, toLowerCase, trim, indexOf, startsWith, endsWith, valueOf
    //- regex: https://regexr.com/ - matches, replaceAll, split
    public static void main(String[] args) {
        String name = "Alex";
        String name2 = new String("Alex");
        String name3 = "Alex";

        System.out.println(name.equals(name2));
        System.out.println(name == name2);
        System.out.println(name == name3);
        name2 = name2.intern();
        System.out.println(name == name2);

        name = name.toUpperCase();
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.substring(0,2));
        System.out.println(name);
//        System.out.println(name.charAt(4)); -- will throw StringIndexOutOfBoundsException
        System.out.println(name.charAt(3));
        String type = "    ananas   ";
        System.out.println(type);
        System.out.println(type.trim());
        System.out.println(name.indexOf('X'));
        int age = 20;
        String ageValue = String.valueOf(age);
        System.out.println(ageValue);

        String toSplit = "Ana are . doua mere";

        String[] split = toSplit.split("\\.");
        System.out.println(split.length);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("something");
        stringBuilder.append("something else");
        System.out.println(stringBuilder);

        Integer integer = 3;
    }
}
