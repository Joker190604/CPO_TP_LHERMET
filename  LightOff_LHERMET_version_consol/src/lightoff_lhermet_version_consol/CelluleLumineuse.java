/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lhermet_version_consol;

/**
 *
 * @author sacha
 */
public class CelluleLumineuse {
    private boolean etat=false;
    //Constructeur par défault pour initialiser l'état de la céllule à "éteinte"
    public CelluleLumineuse(){
       
    }
    //Méthode pour activer la Celulle
    public void activerCelulle(){
        if (etat=false){
        etat=true;
        }
    }
     //Méthode pour éteindre la Celulle
    public void eteindreCellule(){
        etat=false;
    }
    //Méthode pour savoir si la cellule est éteinte ou pas
    public boolean estEteint(){
        if(etat=true){
            return (false);
        }
            return(true);
            
}
    public boolean getEtat(){
        if (etat==true){
            return (true);
        }
        return(false);
    }
    public String toString(){
        String chaine_a_retourner="";
        if (etat==true){
            chaine_a_retourner="X";
        }
        if (etat==false){
            chaine_a_retourner="O";
        }
        return chaine_a_retourner;
    }
   
}

    

 