package com.donjon.model;

public class Warrior extends Hero {
    private static final int MAXATTAQUE = 10;
    private static final int MINATTAQUE = 5;
    private static final int MAXHP = 10;
    private static final int MINHP = 5;


    public Warrior() {
        super("Inconnu", 5, 5);
    }

    public Warrior(String pname) {
        super(pname, 5, 5);
    }

    public Warrior(String pname, int php, int pattaque) {
        super(pname, php, pattaque);
    }

    @Override
    public int getMAXHP() {
        return Warrior.MAXHP;
    }
    @Override
    public int getMINHP() {
        return Warrior.MINHP;
    }
    @Override
    public int getMAXATTAQUE() {
        return Warrior.MAXATTAQUE;
    }

    @Override
    public int getMINATTAQUE() {
        return Warrior.MINATTAQUE;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + super.getName() + '\'' +
                ", hp=" + super.getHp() +
                ", attaque=" + super.getAttaque() +
                '}';
    }
}
