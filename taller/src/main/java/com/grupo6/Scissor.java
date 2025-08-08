package com.grupo6;

public class Scissor extends Choice{
    @Override
    public String name() {
        return "Scissor";
    }

    @Override
    public boolean clash(Choice foe) {
        return (foe.name().equals("Paper"));
    }
}
