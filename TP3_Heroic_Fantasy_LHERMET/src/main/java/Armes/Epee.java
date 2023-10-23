package Armes;

import Armes.Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sacha
 */
public class Epee extends Armes{ 
     int finesse;
    public Epee(String unNom, int unatcklvl,int unfinesse) {
        super(unNom, unatcklvl);
        finesse= unfinesse;
        if (finesse >100){
    System.out.println("tricheur");
    finesse=2;
     }
    }
    
}
