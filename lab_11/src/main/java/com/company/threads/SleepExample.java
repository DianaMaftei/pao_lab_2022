package com.company.threads;

import java.util.Arrays;
import java.util.List;

public class SleepExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> info = Arrays.asList("Hello", "there", "Hi", "again!");
        for (String s : info) {
            Thread.sleep(2000);

            System.out.println(s);
        }
    }
}
