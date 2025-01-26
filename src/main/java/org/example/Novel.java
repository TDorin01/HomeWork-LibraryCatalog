package org.example;

public class Novel extends Book {
    public String type;

    public Novel(String name, int numberOfPages, String type) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Novel name is " + name + "Number of pages " + numberOfPages + "Type is " + type;
    }
}

