package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamsMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Pe aripile vantului", "Name Surname", 1970));
        books.add(new Book("Carte", "Autor", 2000));
        books.add(new Book("Narnia", "someone", 1984));
        books.add(new Book("The shadow Saga", "Orson Scott Card", 1972));
        books.add(new Book("The shadow Saga", "Orson Scott Card", 1972));
        books.add(new Book("Twilight", "A woman", 2005));
        books.add(new Book("Another Book", "An author", 1984));

//        usingStreams(books);
//        generateStream();

        int[] ages = {2, 5, 7, 8, 2, 5};
        IntStream intStream = Arrays.stream(ages).distinct().map(age -> age * 2);
        System.out.println(intStream.anyMatch(age -> age == 10));
//        System.out.println(intStream.max());
//        System.out.println(intStream.min());
//        System.out.println(intStream.sum());
//        System.out.println(books);

//        System.out.println(books.stream().collect(Collectors.toSet()));

//        Map<Integer, List<Book>> booksByYearOfPublication = books.stream().collect(groupingBy(Book::getYearOfPublication));
//        System.out.println(booksByYearOfPublication);

//        System.out.println(books.stream().filter(book -> book.getYearOfPublication() == 1984).findFirst());

//        Stream.generate(() -> Math.random()).forEach(System.out::println);

//        flatMapExample(books);

//        books.stream().limit(2).forEach(System.out::println);
//        books.stream().skip(2).forEach(System.out::println);



    }

    private static void flatMapExample(List<Book> books) {
        List<Book> book2s = Collections.singletonList(new Book("A title", "An author", 2018));
        List<List<Book>> lists = new ArrayList<>();
        lists.add(books);
        lists.add(book2s);
        lists.stream().flatMap(list -> list.stream()).forEach(System.out::println);
    }

    private static void generateStream() {
        Stream<String> fruit = Stream.of("Orange", "Strawberry", "Cherry");
        fruit.forEach(System.out::println);
    }

    private static void usingStreams(List<Book> books) {
        books.stream()
                .filter(book -> isOlderThanTwoThousand(book))
                .peek(System.out::println)
                .sorted(Comparator.comparing(Book::getYearOfPublication))
                .map(book -> book.getTitle())
                .forEach(System.out::println);
    }

    private static void oldWay(List<Book> books) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() < 2000) {
                filteredBooks.add(book);
            }
        }

        Comparator<Book> comparator = new Comparator<>() {
            public int compare(Book book1, Book book2) {
                return book1.getYearOfPublication() - (book2.getYearOfPublication());
            }
        };

        Collections.sort(filteredBooks, comparator);
        System.out.println(filteredBooks);

        System.out.println(books);
    }

    private static boolean isOlderThanTwoThousand(Book book) {
        return book.getYearOfPublication() < 2000;
    }
}
