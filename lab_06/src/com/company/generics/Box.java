package com.company.generics;

public class Box<T> {
    private T contents;

    public T getContents() {
        return contents;
    }

    public void add(T contents) {
        this.contents = contents;
    }
}
