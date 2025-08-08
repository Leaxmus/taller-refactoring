package com.grupo6;

public abstract class Player {
    private int wins;

    public int addWin() {
        return wins++;
    }

    public int getWins() {
        return wins;
    }

    public abstract Choice choose();
}
