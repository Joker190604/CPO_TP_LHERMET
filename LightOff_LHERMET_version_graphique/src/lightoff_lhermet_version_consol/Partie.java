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
           initialiserPartie();

        Scanner scanner = new Scanner(System.in);

 

        System.out.println("Bienvenue dans le jeu LightOff!");

 

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Grille actuelle :");

            System.out.println(grille);

 

            System.out.println("Entrez un coup (L pour ligne, C pour colonne ou D pour diagonale) :");

            String coup = scanner.nextLine();
            int nb = scanner.nextInt();
 

            // Activer la ligne, la colonne ou la diagonale correspondante

            switch (coup) {

                case "L":

                    grille.activerLigneDeCellules(nb); // Par exemple, vous pouvez activer la première ligne

                    break;

                case "C":

                    grille.activerColonneDeCellules(nb); // Par exemple, vous pouvez activer la première colonne

                    break;

                case "D":

                    grille.activerDiagonaleDescendante(); // Par exemple, vous pouvez activer la diagonale descendante

                    break;

                default:

                    System.out.println("Coup invalide. Veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");

            }

            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
        }

 

        System.out.println("Toutes les cellules sont éteintes! Nombre de coups : " + nbCoups);

        scanner.close();

    }
        
      
       
    }
    
