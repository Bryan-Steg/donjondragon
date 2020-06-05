package com.donjon.game;

import com.donjon.PersonnageHorsPlateauException;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {

    private int casePlateau = 64;
    private int dice;
    private int positionJoueur = 0;
    private ArrayList<String> al;

    /**
     * debut game est appeler pour lancer le jeux et gere les choix du joueur sur quitter et continuer
     * @param sc
     */
    public void debutGame(Scanner sc) {

        Boolean Quit = true;
        String Choix;
        plateau();
        System.out.println("Vous voila a l'entrée du donjon a tout moment aprés un combat si vous etes en vis vous pourrez le quitter en tapant le mot 'Q' ou continuer avec 'C'");

        do {
            Choix = sc.nextLine();
            if (Choix.equals("Q")) {
                System.out.println("Vous avez quitter le donjon et perdue tout votre butin accumulez dedans");
                Quit = false;
            } else if (Choix.equals("C")) {
                Quit=jouer();
            }
        }
        while (Quit);

    }
    private boolean jouer(){
        dice = (int) (Math.random() * 6 + 1);
        if (positionJoueur ==0){
            System.out.println("Vous venez de rentrée dans le donjon avancée avec prudence vous pourrez trouver de nombreux trésor mais aussi de nombreux combat plus ou moins difficile venez préparée ou vous mourrez");
        }else{
            System.out.println("Vous pouvez continuer a avancer");
        }
        System.out.println("Vous avancée de " + dice + " cases avanturier");
        try {
            avancer();
            System.out.println("Vous etes sur la casse " + positionJoueur);
            System.out.println(al.get(positionJoueur));
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private void avancer() throws PersonnageHorsPlateauException {
        if (positionJoueur + dice > casePlateau) {
            throw new PersonnageHorsPlateauException();
        } else {
            positionJoueur = positionJoueur + dice;
        }
    }

    private void setCases(int[] indexes, String message) {
        for (int index : indexes) {
            al.set(index, message);
        }
    }

    public void plateau() {
        al = new ArrayList<String>(Collections.nCopies(casePlateau, ""));
        //ennemis
        //Gobelin
        int[] gobelins = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        setCases(gobelins, "Un gobelin vous attaque !");

        //Dragon
        int[] dragon = {45, 52, 56, 62};
        setCases(dragon, "Un Dragon vous attaque !");

        //Sorcier
        int[] sorciers = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        setCases(sorciers, "Un Sorcier vous attaque !");

        //Accessoire
        //massues
        int[] massues = {2, 5, 11, 22, 38};
        setCases(massues, "Tu a récupérer une Massue");

        //épée
        int[] sword = {19, 26, 42, 53};
        setCases(sword, "Tu a récupérer une épée");

        //éclaire
        int[] lightning = {1, 4, 8, 17, 23};
        setCases(lightning, "Tu a récupérer un sort 'éclaire'");

        //boule de feu
        int[] fireball = {48, 53};
        setCases(fireball, "Tu a récupérer un sort 'boules de feu'");

        //potion
        int[] potion = {7, 13, 31, 33, 39, 43};
        setCases(potion, "Tu a récupérer une potion de soin");

        //potion max
        int[] fullpotion = {28, 41};
        setCases(fullpotion, "Tu a récupérer une grande potion de soin");

    }

}
