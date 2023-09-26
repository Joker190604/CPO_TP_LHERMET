/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_lhermet;

import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class TP1_manipNombresInt_LHERMET {

    public static void main(String[] args) {
        Scanner sc ;
        sc= new Scanner(System.in );
        int NE1;
        int NE2;
        int somme;
        int difference;
        int quotient;
        int produit; 
        int reste;
        NE1 = sc.nextInt();
        NE2 = sc.nextInt();
        somme=NE1+NE2;
        difference=NE1-NE2;
        produit=NE1*NE2;
        quotient= NE1/NE2;
        reste=NE1%NE2;
        System.out.println("Somme de deux entiers" +somme);
        System.out.println("difference de deux entiers" +difference);
        System.out.println("produit de deux entiers" +produit);
        System.out.println("quotient de deux entiers" +quotient);
        System.out.println("reste de deux entiers" +reste);
        
        
        
        
                
        
    }
}
