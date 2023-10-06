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
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool+ " degres) \nBrasserie : " + brasserie);
    }
    public BouteilleBiere(String unNom, double unDegre,String unebrasserie){
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = unebrasserie ;
        ouverte = false;
        }
    public boolean Decapsuler(){
        if (ouverte=false){
            ouverte=true;
              System.out.println("La biere a été ouverte");
            return true;
        }
        else{
            System.out.println("La biere est déja ouverte");
            return false;
            
        }
    
}
}


        