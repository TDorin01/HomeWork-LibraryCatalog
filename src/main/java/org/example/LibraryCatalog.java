package org.example;

public class LibraryCatalog {
    Book book1;
    Book book2;
    Book book3;

    public void addBook(Book book) {
        if (book1 == null) {
            this.book1 = book;
            System.out.println ("Added book1!");
            return;
        }
        if (book2 == null) {
            this.book2 = book;
            System.out.println ("Added book2!");
            return;
        }
        if (book3 == null){
            this.book3 = book;
            System.out.println ("Added book3!");
            return;
        }
        System.out.println ("Library is full!");
    }

    public void deleteBook(int index) {
        switch (index){
            case 1: this.book1 = null;
                break;
            case 2: this.book2 = null;
                break;
            case 3: this.book3 = null;
                break;
            default:  System.out.println ("Book with id" + index + "not found");
        }
        System.out.println ("Deleted book: " + index);
    }

    public void listBooks() {
        System.out.println ("Listing all the books");
        System.out.println ("First book " + book1);
        System.out.println ("Second book " + book2);
        System.out.println ("Third book " + book3);
    }
}
