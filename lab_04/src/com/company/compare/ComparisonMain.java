package com.company.compare;

import java.util.Arrays;

public class ComparisonMain {

    public static void main(String[] args) {
        Book b1 = new Book(1985, "Capra cu trei iezi", "Ion Creanga");
        Book b2 = new Book(1901, "Luceafarul", "Mihai Eminescu");
        Book b3 = new Book(1866, "1 scrisoare", "Caragiale");
        Book[] arr = {b1, b2, b3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        TitleComparator titleComparator=new TitleComparator();
        Arrays.sort(arr,titleComparator);
        System.out.println(Arrays.toString(arr));


    }

}


