package models;

import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private int date;
    private String genre;
    private double sales;

    public Album() {}

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getArtist() { return artist; }

    public void setArtist(String artist) { this.artist = artist; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getDate() { return date; }

    public void setDate(int date) { this.date = date; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public double getSales() { return sales; }

    public void setSales(double sales) { this.sales = sales; }
}
