package com.grupo6;

import com.grupo6.ChoiceStrategies.*;
import com.grupo6.ChoiceTypes.Choice;
import com.grupo6.PlayerClass.Player;

public class RPSgame {
    Player p1 = new Player(new PlayerChoiceStrategy());
    Player p2 = new Player(new BotChoiceStrategy());
    boolean gameWon = false;
    int roundsPlayed = 0;
    int draws = 0;

    public void startGame() {
        do {
            System.out.printf("Round: \n", roundsPlayed);
            System.out.printf("Number of Draws: \n", draws);
            clash();
            if (p1.getWins() >= 3 || p2.getWins() >= 3) {
                gameWon = true;
            }
        } while (!gameWon);
        showResults();
    }

    private void clash() {
        Choice c1 = p1.choose();
        Choice c2 = p2.choose();
        if (c1.clash(c2) || c2.clash(c2)) {
            System.out.println("Draw");
            draws++;
        }
        if (c1.clash(c2)) {
            System.out.println("Player 1 Wins!");
            p1.addWin();
        }
        if (c2.clash(c1)) {
            System.out.println("Player 2 Wins!");
            p2.addWin();
        }        
    }

    private void showResults() {
        System.out.printf("%s Won the Game!!!\n", (p1.getWins() > p2.getWins()) ? "Player 1" : "Player 2");
    }
}
