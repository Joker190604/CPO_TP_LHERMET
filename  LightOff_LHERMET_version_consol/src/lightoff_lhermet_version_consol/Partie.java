/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lhermet_version_consol;

import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class Partie {
     GrilleDeCellules grille = new GrilleDeCellules(10,10);
     int nbCoups;
    public Partie() {
        int nbCoups = 0;
    }
    
        public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
        }
        
        public void lancerPartie() {
         Scanner scanner = new Scanner(System.in);
         while (!grille.cellulesToutesEteintes()) {
            System.out.println("Grille de jeu :");
            System.out.println(grille);
            System.out.println("Nombre de coups joués : " + nbCoups);

            // Demander au joueur de saisir un coup
            System.out.println("Entrez la ligne, la colonne ou la diagonale à activer (ex: '2 3' ou 'd') :");
            int nb = scanner.nextInt();
            if (nb> 10) {
                                  System.out.println("Coup invalide.");  
            }
String choix=scanner.nextLine();
            // Activer la ligne, la colonne ou la diagonale correspondante
            if (nb == 1) {
       
                if (choix == "d") {
                    grille.activerDiagonaleDescendante();
                if (choix == "l") {
                    grille.activerLigneDeCellules(1);
                }
                 if (choix == "c") {
                    grille.activerColonneDeCellules(1);
                }
                } else {
                    System.out.println("Coup invalide.");
                }
                 if (nb == 2) {
       
                if (choix == "d") {
                    grille.activerDiagonaleMontante();
                if (choix == "l") {
                    grille.activerLigneDeCellules(2);
                }
                 if (choix == "c") {
                    grille.activerColonneDeCellules(2);
                }
                } else {
                    System.out.println("Coup invalide.");
                }
                if (nb == 2) {
       
                if (choix == "d") {
                    grille.activerDiagonaleMontante();
                if (choix == "l") {
                    grille.activerLigneDeCellules(2);
                }
                 if (choix == "c") {
                    grille.activerColonneDeCellules(2);
                }
                } else {
                    System.out.println("Coup invalide.");
                }
                if (nb > 2) {
       
                   
                if (choix == "l") {
                    grille.activerLigneDeCellules(nb);
                }
                 if (choix == "c") {
                    grille.activerColonneDeCellules(nb);
                }
                } else {
                    System.out.println("Coup invalide.");
                }
            }

            nbCoups++;
        }

        System.out.println("Bravo ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
    }
       
     
       
         }
   }
        
      
       
    }
    
