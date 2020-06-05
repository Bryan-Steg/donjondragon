package com.donjon.game;

import com.donjon.model.*;
import com.donjon.game.Game;

import java.util.Scanner;

public class Menu {


    public void createHero(Hero hero, Scanner sc){
        System.out.println("Vous avez crée un : " + hero);
        System.out.println("Veuillez choisir un nom pour votre héros !");
        hero.setName(sc.nextLine());
        System.out.println("Votre aventure va pouvoir débuter heros " + hero.getName() + ", Soyez fort, soyez brave et que retentise les cornes du valhalla pour vous !");
        System.out.println("Il va etre temps de choisir vos caractéristique héros ou rester sur celle de base  votre vitalité étant de " + hero.getHp() + " et d'une puissance de frappe de " + hero.getAttaque());
        System.out.println(" Le maximum que vous pouvez avoir étant de"+hero.getMAXHP()+ "en vitalité et"+ hero.getMAXATTAQUE()+ "en puissance de frappe Commencons pars votre vitalité rentrée un montant entre"+hero.getMINHP()+" et"+hero.getMAXHP());
        hero.setHp(sc.nextInt());
        System.out.println("Vous vous etes attribué " + hero.getHp() + " en Vitalité veuillez faire la même manipulation pour saisir votre puissance de frappe entre"+hero.getMINATTAQUE() +" et" + hero.getMAXATTAQUE() + " à nouveau");
        hero.setAttaque(sc.nextInt());
        System.out.println("Vous voila fin prêt pour l'aventure hero " + hero.getName() + " votre puissance de frappe et de " + hero.getAttaque() + " et votre vitalité est de " + hero.getHp());
        sc.nextLine();

    }
    public void infoPersonnage(Scanner sc) {

        String choixPerso;
        boolean choixok = true;

        do {
            System.out.println("Si vous ne voulez pas commencer cette aventure écrivez : Quit");
            System.out.println("Pour Choisir votre personnage écrivez : Warrior ou Mage");
            choixPerso = sc.nextLine();
            if (choixPerso.equals("Quit")) {
                choixok = false;

            } else if (choixPerso.equals("Warrior")) {
                createHero(new Warrior(), sc);
                Game game=new Game();
                game.debutGame(sc);

            } else if (choixPerso.equals("Mage")) {
                createHero(new Mage(), sc);
                Game game=new Game();
                game.debutGame(sc);
            } else {
                System.out.println("Vous n'avez pas fait le bon choix");
            }

        } while (choixok);

    }
}
