/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp1_guessmynumber_lhermet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class TP1_guessMyNumber_LHERMET {

    public static void main(String[] args) {
        int nbr = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int nombrealéatoire = generateurAleat.nextInt(100);

        System.out.println("Nombre");
        nbr = sc.nextInt();

        for (int i = 0; i<100; i++) {
            if (0 > nbr || 1000 < nbr) {
                System.out.println("Nombre2");
                nbr = sc.nextInt();
            } else {
                if (nombrealéatoire < nbr) {
                    System.out.println("trop grand");
                    nbr = sc.nextInt();
                }
                if (nombrealéatoire > nbr) {
                    System.out.println(" trop petit");
                    nbr = sc.nextInt();
                    if (nombrealéatoire == nbr) {
                        System.out.println(" Gagné" + i + 1 + " try");
                        break;

                    }
                }

            }
        }
    }
}
