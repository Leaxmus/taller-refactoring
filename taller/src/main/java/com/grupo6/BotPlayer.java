package com.grupo6;

public class BotPlayer extends Player{

    @Override
    public Choice choose() {
        return Choice.randomChoice();
    }

}
