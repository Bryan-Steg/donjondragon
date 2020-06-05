package com.donjon;

public class PersonnageHorsPlateauException extends Exception{
    //crée constructeur
    //appeller le constructeur du parent
    public PersonnageHorsPlateauException(String message){
        super(message);
    }

    public PersonnageHorsPlateauException(){
        super("Vous avez reussi à sortir du donjon tout mes félicitation aventurier !");
    }
}
