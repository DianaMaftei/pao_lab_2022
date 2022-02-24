package com.company.examples;

public class Types {

    public static void main(String[] args) {
        // numerice
        // 1
        byte myBite = 1;
        short myShort = 30000;
        int myInt = 100_000_000;
        long myLong = 100_000_000_000_000L;
        float myFloat = (float) 2.14;
        double myDouble = 2.14;

        Byte minB = Byte.MIN_VALUE;
        Byte maxB = Byte.MIN_VALUE;
        Short mins = Short.MIN_VALUE;
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;

        Byte myWrapperByte = Byte.valueOf(myBite);
        Byte myWrapperByte2 = 2;

        // alfanumerice
        char c = 'a';
        char d = 'c';

        String myString = "abcjdflksadjflksad jf" +
                "aksdjflkdsafjlkdsajf " +
                "alksjfd lkajsdlkf j";

        // other
        boolean t = true;
        boolean f = false;
    }
}
