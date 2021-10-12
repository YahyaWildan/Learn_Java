package com.example.studicaselogin.home;

public class GamesModel {
    int image;
    String starRate, tittleGame;

    public GamesModel(int image, String starRate, String tittleGame) {
        this.image = image;
        this.starRate = starRate;
        this.tittleGame = tittleGame;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStarRate() {
        return starRate;
    }

    public void setStarRate(String starRate) {
        this.starRate = starRate;
    }

    public String getTittleGame() {
        return tittleGame;
    }

    public void setTittleGame(String tittleGame) {
        this.tittleGame = tittleGame;
    }
}
