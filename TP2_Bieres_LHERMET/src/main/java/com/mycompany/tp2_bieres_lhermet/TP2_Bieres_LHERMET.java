/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_bieres_lhermet;

/**
 *
 * @author sacha
 */
public class TP2_Bieres_LHERMET {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("cuvée des trolls",);
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();

        BouteilleBiere secondebière = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe");
        secondebière.Nom = "Leffe";
        secondebière.degreAlcool = 6.6;
        secondebière.brasserie = "Abbaye de Leffe";
        secondebière.ouverte = false;
        secondebière.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;


    }

}
