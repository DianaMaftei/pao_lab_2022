package com.company.csv;

import com.company.streams.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvMain {
    public static void main(String[] args) throws FileNotFoundException {
        Book book = new Book("Carte", "Autor", 2000);
        writeBook(book);

        List<String> names = List.of("Diana", "Anca");
        String joinedNames = String.join("|", names);
        System.out.println(joinedNames);
        System.out.println(Arrays.stream(joinedNames.split("\\|")).collect(Collectors.toList()));
    }

    private static void writeBook(Book book) throws FileNotFoundException {
        File csvOutputFile = new File("src\\com\\company\\resources\\book.csv");
        String formattedBook = convertToCsvFormat(book);

        try (PrintWriter pw = new PrintWriter(new FileOutputStream(csvOutputFile, true))) {
            pw.append(formattedBook);
        }
    }

    private static String convertToCsvFormat(Book book) {
        StringBuilder bookToString = new StringBuilder();
        bookToString.append(book.getTitle());
        bookToString.append(";");
        bookToString.append(book.getAuthor());
        bookToString.append(";");
        bookToString.append(book.getYearOfPublication());
        bookToString.append(";");

        return bookToString.toString();
    }
}
