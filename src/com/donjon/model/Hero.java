package com.donjon.model;

import com.donjon.accessoire.Accesoire;

/**
 * Class heritage pour tout les heros
 * @author Bryan
 * @version 1.0
 *
 */
public abstract class Hero {
    private String name;
    private int hp;
    private int attaque;
    private Accesoire arme;

    //constructeur
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

    /**
     *getter pour le nom du hero
     * @return string hero name
     */
    public String getName() {
        return name;
    }

    /**
     * getter pour les hp du hero
     * @return int hero hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * getter pour l'attaque du hero
     * @return int hero attaque
     */
    public int getAttaque() {
        return attaque;
    }

    /**
     *setter pour donner un nom au hero
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp < getMINHP()) {
            this.hp = getMINHP();
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
            this.attaque = getMAXATTAQUE();
        } else {
            this.attaque = pattaque;
        }
    }

    public abstract int getMAXATTAQUE();

    public abstract int getMINATTAQUE();
}
