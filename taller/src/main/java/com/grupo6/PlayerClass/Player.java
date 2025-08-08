package com.grupo6.PlayerClass;

import com.grupo6.ChoiceStrategies.ChoiceStrategy;
import com.grupo6.ChoiceTypes.Choice;

public class Player {
    private final ChoiceStrategy choiceStrategy;
    private int wins = 0;

    public Player(ChoiceStrategy choiceStrategy) {
        this.choiceStrategy = choiceStrategy;
    }
    
    public int addWin() {
        return wins++;
    }

    public int getWins() {
        return wins;
    }

    public Choice choose(){
        return this.choiceStrategy.choose();
    }
}
