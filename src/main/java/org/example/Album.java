package org.example;

public class Album extends LibraryItem{

    private int trackCount;

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount(){
        return trackCount;
    }

    public String toString(){
        return "Album: " + super.toString() + trackCount + " tracks";
    }
}
