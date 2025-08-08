package com.grupo6;

public class HumanPlayer extends Player{

    @Override
    public Choice choose() {
        return Choice.randomChoice();
        // O logica diferente
    }
    
}
