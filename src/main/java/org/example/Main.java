package org.example;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Novel("Ion", 234, "mistery"); //polimorfism book
        Book book2 = new ArtAlbum("Art of Music", 500, "opacity"); //polimorfism book:poate avea mai multe forme
        Book book3 = new Novel("Enigma Otiliei", 450, "romance"); //polimorfism book

        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.addBook(book3);
        catalog.addBook(book1);
        System.out.println ("\n" +  "-------------------------------------------");

        catalog.listBooks();

        catalog.deleteBook(2);
        System.out.println ("\n" +  "-------------------------------------------");
        catalog.listBooks();
        catalog.deleteBook(50);

    }
}

