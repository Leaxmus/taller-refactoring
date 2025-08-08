package com.grupo6;

import java.util.List;
import java.util.Random;

public abstract class Choice {

    private static final List<Choice> Movs = List.of(
        new Rock(),
        new Paper(),
        new Scissor()
        );
    private static Random random = new Random();

    public abstract boolean clash(Choice foe);

    public abstract String name();

    public static Choice randomChoice() {
        return Movs.get(random.nextInt(Movs.size());
    }
}
