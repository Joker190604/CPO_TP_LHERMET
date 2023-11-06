/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lhermet_version_consol;

import java.util.Random;


/**
 *
 * @author sacha
 */
public class GrilleDeCellules {
     CelluleLumineuse[][] matriceCellules = null;
  int nbLigne;
  int nbColonnes;
  public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLigne = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLigne][nbColonnes];
            for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }   
}
  public boolean VerifToutesLesCellulesEteintes() {

   for (int ligne = 0; ligne < nbLigne; ligne++) {

        for (int colonne = 0; colonne < nbColonnes; colonne++) {

        if (matriceCellules[ligne][colonne].getEtat()==true) {

            return false;
        }
        else{
            return true;
        }
   

            }
        }
    
      return false;
  }
  
  
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

       public void activerLigneColonneOuDiagonaleAleatoire(){
     Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        for (int i=0;i<n;i++){
            int f=generateurAleat.nextInt(100);
            if (f<50){
               int r=generateurAleat.nextInt(10);
               for(int j=0;j<10;j++){
             matriceCellules[r][j].activerCelulle();  
               }
            }
            if (f>50||f<100){
               int r=generateurAleat.nextInt(10);
               for(int j=0;j<10;j++){
             matriceCellules[j][r].activerCelulle();  
               }
            }
            if (f==100){
            int r=generateurAleat.nextInt(10);
               for(int j=0;j<10;j++){
             matriceCellules[j][j].activerCelulle();  
               }
            }
            if (f==101){
               for(int j=0;j<10;j++){
             matriceCellules[j][9-j].activerCelulle(); 
            
            }
                   
        }
      }   
       }
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

     public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCelulle();
        }
    }
    
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLigne; i++) {
            matriceCellules[i][idColonne].activerCelulle();
        }
    }

public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLigne && i < nbColonnes; i++) {
            matriceCellules[i][i].activerCelulle();
        }
    }
public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLigne && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCelulle();
        }
}
 public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }
  @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();

        gridString.append(" |");
        for (int i = 0; i < nbColonnes; i++) {
            gridString.append(" " + i + " |");
        }
        gridString.append("\n");
        for (int i = 0; i < nbLigne; i++) {
            gridString.append("--------------------------------\n");
            gridString.append(i + " |");
            for (int j = 0; j < nbColonnes; j++) {
                gridString.append(" " + (matriceCellules[i][j].getEtat() ? "X" : "O") + " |");
            }
            gridString.append("\n");
        }
        gridString.append("--------------------------------\n");

        return gridString.toString();
    }

    int getNbLignes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getNbColonnes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}



  
