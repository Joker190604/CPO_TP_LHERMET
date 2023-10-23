/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author sacha
 */
public class Baton extends Armes{ 
    int age ;
    public Baton(String unNom, int unatcklvl,int unage) {
        super(unNom, unatcklvl);
        age = unage;
        if (age >100){
    System.out.println("tricheur");
    age=2;
     }
    }
    
}
   