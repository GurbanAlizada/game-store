package Entities;

import java.time.LocalDate;

public class Game {

    private int id;
    private String gameName;
    private int price;
    private LocalDate releaseDate;

    public Game(int id, String gameName, int price, LocalDate releaseDate) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public Game() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
