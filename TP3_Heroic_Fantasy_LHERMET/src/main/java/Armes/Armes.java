/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author sacha
 */
abstract public class Armes {
    private String nom;

    public String getNom() {
        return nom;
    }
    int atcklvl;
    
public Armes(String unNom,int unatcklvl){
    nom=unNom;
    atcklvl=unatcklvl;
     if (atcklvl >100){
    System.out.println("tricheur");
    atcklvl=2;
     }

}
@Override
public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner=nom+"debate:"+atcklvl;
    System.out.println("chaine_a_retourner");
    return chaine_a_retourner;
     
    
}
}

