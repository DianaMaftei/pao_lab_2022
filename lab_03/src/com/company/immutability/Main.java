package com.company.immutability;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ImmutableExample immutableExample = new ImmutableExample(LocalDate.now());

        LocalDate dateFromIE = immutableExample.getDate();
        dateFromIE = dateFromIE.plusDays(2);
        System.out.println(dateFromIE);

        System.out.println(immutableExample.getDate());

    }
}
