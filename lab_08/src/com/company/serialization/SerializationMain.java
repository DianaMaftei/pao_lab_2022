package com.company.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        writeBook();
        System.out.println(readBook());
    }

    private static void writeBook() {
        try (FileOutputStream out = new FileOutputStream("output.txt"); ObjectOutputStream oos = new ObjectOutputStream(out)) {
            Book book = new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890, 75);
            oos.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Book readBook() {
        try (FileInputStream in = new FileInputStream("output.txt"); ObjectInputStream ois = new ObjectInputStream(in)) {
            return (Book) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
