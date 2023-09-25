/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

/**
 *
 * @author sacha
 * prenom Sacha Lhermet
 * classe TDC
 * Date 25/09
 * */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
    //Declaration des variables
        int nb;
        int result;
        int ind;
        nb=5;
        result=0;
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind+= 1 ;
        }

        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
}
    
}
