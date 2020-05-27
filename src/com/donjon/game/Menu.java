package com.donjon.game;

import com.donjon.model.*;
import com.donjon.game.Game;

import java.util.Scanner;

public class Menu {

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
                System.out.println("Vous avez crée un : " + choixPerso);
                Warrior warrior = new Warrior();
                System.out.println("Veuillez choisir un nom pour votre héros !");
                warrior.setName(sc.nextLine());
                System.out.println("Votre aventure va pouvoir débuter heros " + warrior.getName() + ", Soyez fort, soyez brave et que retentise les cornes du valhalla pour vous !");
                System.out.println("Il va etre temps de choisir vos caractéristique héros ou rester sur celle de base  votre vitalité étant de " + warrior.getHp() + " et d'une puissance de frappe de " + warrior.getAttaque());
                System.out.println(" Le maximum que vous pouvez avoir étant de 10 en vitalité et 10 en puissance de frappe Commencons pars votre vitalité rentrée un montant entre 5 et 10");
                warrior.setHp(sc.nextInt());
                System.out.println("Vous vous etes attribué " + warrior.getHp() + " en Vitalité veuillez faire la même manipulation pour saisir votre puissance de frappe entre 5 et 10 à nouveau");
                warrior.setAttaque(sc.nextInt());
                System.out.println("Vous voila fin prêt pour l'aventure hero " + warrior.getName() + " votre puissance de frappe et de " + warrior.getAttaque() + " et votre vitalité est de " + warrior.getHp());
                sc.nextLine();
                Game game=new Game();
                game.debutGame(sc);

            } else if (choixPerso.equals("Mage")) {
                System.out.println("Vous avez crée un : " + choixPerso);
                Mage mage = new Mage();
                System.out.println("Veuillez choisir un nom pour votre héros !");
                mage.setName(sc.nextLine());
                System.out.println("Votre aventure va pouvoir débuter heros " + mage.getName() + ", Soyez fort, soyez brave et que retentise les cornes du valhalla pour vous !");
                System.out.println("Il va etre temps de choisir vos caractéristique héros ou rester sur celle de base  votre vitalité étant de " + mage.getHp() + " et d'une puissance de frappe de " + mage.getAttaque());
                System.out.println(" Le maximum que vous pouvez avoir étant de 6 en vitalité et 15 en puissance de frappe Commencons pars votre vitalité rentrée un montant entre 3 et 6");
                mage.setHp(sc.nextInt());
                System.out.println("Vous vous etes attribué " + mage.getHp() + " en Vitalité veuillez faire la même manipulation pour saisir votre puissance de frappe entre 8 et 15 à nouveau");
                mage.setAttaque(sc.nextInt());
                System.out.println("Vous voila fin prêt pour l'aventure hero " + mage.getName() + " votre puissance de frappe et de " + mage.getAttaque() + " et votre vitalité est de " + mage.getHp());
                sc.nextLine();
                Game game=new Game();
                game.debutGame(sc);
            } else {
                System.out.println("Vous n'avez pas fait le bon choix");
            }

        } while (choixok);

    }
}
