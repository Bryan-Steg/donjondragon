package com.donjon.model;

public class Mage extends Hero {

    private static final int MAXATTAQUE = 15;
    private static final int MINATTAQUE = 8;
    private static final int MAXHP = 6;
    private static final int MINHP = 3;

    /*Constructor*/
    public Mage() {
        super("Inconnu", 3, 8);
    }

    public Mage(String pname) {
        super(pname, 3, 8);
    }

    public Mage(String pname, int php, int pattaque) {
        super(pname, php, pattaque);
    }

    @Override
    public int getMAXHP() {
        return Mage.MAXHP;
    }
    @Override
    public int getMINHP() {
        return Mage.MINHP;
    }

    @Override
    public int getMAXATTAQUE() {
        return Mage.MAXATTAQUE;
    }

    @Override
    public int getMINATTAQUE() {
        return Mage.MINATTAQUE;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + super.getName() + '\'' +
                ", hp=" + super.getHp() +
                ", attaque=" + super.getAttaque() +
                '}';
    }
}
