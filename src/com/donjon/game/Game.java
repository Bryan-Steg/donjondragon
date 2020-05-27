package com.donjon.game;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Game {
    private int casePlateau=64;
    private int dice;
    private int positionJoueur =0;

    public void debutGame(Scanner sc) {

        Boolean Quit = true;
        String Choix;
        System.out.println("Vous voila a l'entrée du donjon a tout moment aprés un combat si vous etes en vis vous pourrez le quitter en tapant le mot 'Q' ou continuer avec 'C'");
        do {
            Choix=sc.nextLine();
            dice = (int) (Math.random()*6 + 1) ;
            if (Choix.equals("Q")){
                System.out.println("Vous avez quitter le donjon et perdue tout votre butin accumulez dedans");
                Quit = false;
            }
            else if(positionJoueur==0 && Choix.equals("C")){
                System.out.println("Vous venez de rentrée dans le donjon avancée avec prudence vous pourrez trouver de nombreux trésor mais aussi de nombreux combat plus ou moins difficile venez préparée ou vous mourrez");
                System.out.println("Vous avancée de " + dice + " cases avanturier");
                positionJoueur=positionJoueur+dice;
                System.out.println("Vous etes sur la casse " + positionJoueur);
            }else if (positionJoueur <= casePlateau){
                System.out.println("Vous pouvez continuer a avancer");
                System.out.println("Vous avancée de " + dice + " cases avanturier");
                positionJoueur=positionJoueur+dice;
                System.out.println("Vous etes sur la casse " + positionJoueur);
            }else if (positionJoueur >= casePlateau){
                System.out.println("Vous avez reussi à sortir du donjon tout mes félicitation aventurier !");
                Quit=false;
            }

        }
        while (Quit);
    }


}
