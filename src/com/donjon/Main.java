package com.donjon;
import com.donjon.game.*;
import com.donjon.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        menu.infoPersonnage(sc);
    }

}
