package com.grupo6.ChoiceTypes;

public class Paper extends Choice {
    @Override
    public String name() {
        return "Paper";
    }
    @Override
    public boolean clash(Choice foe) {
        return(foe.name().equals("Rock"));
    }
}
