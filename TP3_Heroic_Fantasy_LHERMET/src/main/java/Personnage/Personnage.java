/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Armes;
import java.util.ArrayList;

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
    Armes armekip=null;
    
       
public Personnage(String unNom,int unpv, Armes unarmekip){
    nom=unNom;
    pv=unpv;
    armekip=unarmekip;
     if (pv >100){
    System.out.println("tricheur");
    pv=2;
     }

}
@Override
public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner=nom+"debate:"+pv+armekip;
    System.out.println("chaine_a_retourner");
    return chaine_a_retourner;
     
}

ArrayList<Armes> stuff =new ArrayList<Armes>();
ArrayList<Armes> unarmekip =new ArrayList<Armes>();

        
   public static void ajout (ArrayList<Armes> stuff, Armes nouvelle_arme){   

    if (stuff.size()<4){

        stuff.add(nouvelle_arme);
    }
   }
   public void arme_selectionner(ArrayList<Armes> stuff,ArrayList<Armes> nouvelle_arme){
       int w;
       for(int i=0;i<stuff.size();i++){
           System.out.println(i+":"+stuff.get(i));
       }
       scanner sc;
       sc=new scanner(System.in);
       w=sc.nextInt();
       armekip=stuff.get(w);
}

    public Armes getArmekip() {
        return armekip;
    }
}


    
