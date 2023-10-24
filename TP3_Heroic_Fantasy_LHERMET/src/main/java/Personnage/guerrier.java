/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Armes;
import Personnage.Personnage;

/**
 *
 * @author sacha
 */
 public class guerrier extends Personnage{ 
boolean cheval;
    public guerrier(String unNom, int unpv,boolean uncheval, Armes unarmekip) {
        super(unNom, unpv, unarmekip);
        cheval=uncheval;
        
        
    }
}
