package com.donjon.accessoire;

public abstract class Accesoire {
    private String name;
    private int puissance;

    public Accesoire(String name, int puissance) {
        this.name = name;
        this.puissance = puissance;
    }
}
