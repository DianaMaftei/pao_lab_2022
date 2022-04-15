package com.company.functional;

import com.company.serialization.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalProgrammingMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anastasia");
        names.add("Diana");
        names.add("Dorian");

        names.forEach(name -> System.out.println(name));
        Predicate<String> myPredicate = name -> "Dorian".equals(name);
        names.removeIf(myPredicate);
        System.out.println("-----");
        names.forEach(name -> System.out.println(name));
        System.out.println("-----");

        Function<String, Integer> func1 = (s) -> s.length();
        System.out.println(func1.apply("supercalifragilisticexpialidocious"));
        System.out.println("-----");

        Function<String, String> func2 = (s) -> "Helloooo " + s;
        System.out.println(func2.apply("Nurse"));
        System.out.println("-----");

        Supplier<Book> getBook = () -> new Book("The Jungle Book", "Rudyard Kipling", 1894, 59);
        System.out.println(getBook.get());
    }

    private static void playWithMathCompute() {
        // sum
        System.out.println(doCompute((a, b) -> a + b, 5, 8));

        // subtract
        System.out.println(doCompute((a, b) -> a - b, 5, 8));

        // multiply
        System.out.println(doCompute((a, b) -> {return a * b;}, 5, 8));

        // divide
        System.out.println(doCompute((a, b) -> {return b / a;}, 5, 8));
    }

    private static int doCompute(Math math, int a, int b) {
        return math.compute(a, b);
    }

}
