package com.example.laba3list;

public class GamesGroup {
    private int gameName;
    private int gameGenre;
    private int gameYear;
    private int gameIcon;
    private int gameDescription;
    private int gameInfo;

    public GamesGroup(int gameName, int gameGenre, int gameYear, int gameIcon, int gameDescription, int gameInfo) {
        this.gameName = gameName;
        this.gameGenre = gameGenre;
        this.gameYear = gameYear;
        this.gameIcon = gameIcon;
        this.gameDescription = gameDescription;
        this.gameInfo = gameInfo;
    }

    public int getGameName() {
        return gameName;
    }

    public void setGameName(int gameName) {
        this.gameName = gameName;
    }

    public int getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(int gameGenre) {
        this.gameGenre = gameGenre;
    }

    public int getGameYear() {
        return gameYear;
    }

    public void setGameYear(int gameYear) {
        this.gameYear = gameYear;
    }

    public int getGameIcon() {
        return gameIcon;
    }

    public void setGameIcon(int gameIcon) {
        this.gameIcon = gameIcon;
    }

    public int getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(int gameDescription) {
        this.gameDescription = gameDescription;
    }

    public int getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(int gameInfo) {
        this.gameInfo = gameInfo;
    }
}
