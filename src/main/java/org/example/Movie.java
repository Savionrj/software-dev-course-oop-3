package org.example;

public class Movie extends LibraryItem {

    private int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes){
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String toString(){
        return "Movie: " + super.toString() + durationInMinutes + " minutes";
    }
}
