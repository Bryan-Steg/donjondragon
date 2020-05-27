package com.donjon.model;

abstract class Hero {
    private String name;
    private int hp;
    private int attaque;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int hp, int attaque) {
        this.name = name;
        this.hp = hp;
        this.attaque = attaque;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp < getMINHP()) {
            this.hp = getMINHP() ;
        } else if (hp > getMAXHP()) {
            this.hp = getMAXHP();
        } else {
            this.hp = hp;
        }
    }

    public abstract int getMAXHP();
    public abstract int getMINHP();

    public void setAttaque(int pattaque) {
        if (pattaque < getMINATTAQUE()) {
            this.attaque = getMINATTAQUE();
        } else if (pattaque > getMAXATTAQUE()) {
            this.attaque=getMAXATTAQUE();
        } else {
            this.attaque=pattaque;
        }
    }
    public abstract int getMAXATTAQUE();
    public abstract int getMINATTAQUE();
}
