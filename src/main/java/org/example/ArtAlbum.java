package org.example;

public class ArtAlbum extends Book {
    public String paperQuality;

    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "paperQuality='" + paperQuality + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

}

