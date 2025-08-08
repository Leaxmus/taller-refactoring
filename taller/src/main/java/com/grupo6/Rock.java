package com.grupo6;

public class Rock extends Choice {

    @Override
    public String name() {
        return "Rock";
    }

    @Override
    public boolean clash(Choice foe) {
        return (foe.name().equals("Scissor"));
    }
}
