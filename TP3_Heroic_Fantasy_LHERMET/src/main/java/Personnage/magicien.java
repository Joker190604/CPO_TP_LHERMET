/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Personnage.Personnage;

/**
 *
 * @author sacha
 */

   public class magicien extends Personnage{ 
       boolean confirmé;
    
    public magicien(String unNom, int unpv,boolean unconfirmé) {
        super(unNom, unpv);
        confirmé=unconfirmé;
    
        }
    
    }
