/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author sacha
 */
abstract public class Personnage {
    private String nom;

    public String getNom() {
        return nom;
    }
    int pv;
    
public Personnage(String unNom,int unpv){
    nom=unNom;
    pv=unpv;
     if (pv >100){
    System.out.println("tricheur");
    pv=2;
     }

}
@Override
public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner=nom+"debate:"+pv;
    System.out.println("chaine_a_retourner");
    return chaine_a_retourner;
     
    
}
}
    

