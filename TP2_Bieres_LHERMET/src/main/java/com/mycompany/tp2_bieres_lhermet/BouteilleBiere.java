/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_lhermet;

/**
 *
 * @author sacha
 */
public class BouteilleBiere {

    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 
,"Abbaye de Leffe") ;

    }

}
