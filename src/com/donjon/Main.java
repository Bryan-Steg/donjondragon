package com.donjon;
import com.donjon.accessoire.Accesoire;
import com.donjon.accessoire.Potion;
import com.donjon.arme.Massues;
import com.donjon.game.*;
import com.donjon.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        menu.infoPersonnage(sc);
        Game game=new Game();

    }

}
