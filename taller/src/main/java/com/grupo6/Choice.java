package com.grupo6;

public abstract class Choice {

    public abstract boolean clash(Choice foe);

    public abstract String name();

    public static Choice randomChoice() {
        // Logica para elegir una opcion
        return null;
    }
}
