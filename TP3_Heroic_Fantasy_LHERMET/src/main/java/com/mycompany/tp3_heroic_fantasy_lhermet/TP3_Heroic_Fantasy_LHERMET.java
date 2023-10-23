/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_lhermet;

import Personnage.magicien;
import Personnage.guerrier;
import Personnage.Personnage;
import Armes.Epee;
import Armes.Armes;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author sacha
 */
public class TP3_Heroic_Fantasy_LHERMET {

    public static void main(String[] args) {
        Epee Epee1=new Epee("Excalibur",7,5);
        Epee Epee2=new Epee("Durandal",4,7);
        Baton Baton1 =new Baton("Chêne", 4, 5 );
        Baton Baton2 =new Baton("Charme", 5, 6 );  
        ArrayList<Armes> stuff= new ArrayList<Armes>();
        stuff.add(Epee1);
        stuff.add(Epee2);
        stuff.add(Baton1);
        stuff.add(Baton2);
        for(int i=0;i<stuff.size();i++){
            System.out.println(stuff.get(i));
        }
            
        magicien magicien1=new magicien("Gandalf",65,true);
         magicien magicien2=new magicien("Garcimore",44,false);
        guerrier guerrier1 =new guerrier("Conan", 78, false );
        guerrier guerrier2 =new guerrier("Lannister", 45, true );  
        ArrayList<Personnage> team= new ArrayList<Personnage>();
        team.add(magicien1);
        team.add(magicien2);
        team.add(guerrier1);
        team.add(guerrier2);
        for(int i=0;i<team.size();i++){
            System.out.println(team.get(i));
       
        
        }
    }
    }

        

