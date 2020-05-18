package com.donjon.model;

public class Mage {
    private String name;
    private int hp;
    private int attaque;
    private final int MAXATTAQUE = 15;
    private final int MINATTAQUE = 8;
    private final int MAXHP = 6;
    private final int MINHP = 3;

    /*Constructor*/
    public Mage() {
        name = "Inconnu";
        hp = 3;
        attaque = 8;
    }

    public Mage(String pname) {
        name = pname;
        hp = 3;
        attaque = 8;
    }

    public Mage(String pname, int php, int pattaque) {
        name = pname;
        hp = php;
        attaque = pattaque;
    }

    /*Getters*/
    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttaque() {
        return this.attaque;
    }

    /*Setters*/
    public void setName(String pName) {
        name = pName;
    }

    public void setHp(int php) {
        if (php <= MINHP) {
            this.hp = MINHP;
        } else if (php >= MAXHP) {
            this.hp = MAXHP;
        } else {
            this.hp = php;
        }
    }

    public void setAttaque(int pattaque) {
        if (pattaque <= MINATTAQUE) {
            this.attaque = MINATTAQUE;
        } else if (pattaque >= MAXATTAQUE) {
            this.attaque = MAXATTAQUE;
        } else {
            this.attaque = pattaque;
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attaque=" + attaque +
                '}';
    }
}
