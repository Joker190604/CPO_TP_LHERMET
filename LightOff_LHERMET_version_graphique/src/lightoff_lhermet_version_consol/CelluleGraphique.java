package lightoff_lhermet_version_consol;


import java.awt.Graphics;
import javax.swing.JButton;
import lightoff_lhermet_version_consol.CelluleLumineuse;
import lightoff_lhermet_version_consol.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sacha
 */
public class CelluleGraphique extends JButton {
  CelluleLumineuse celluleLumineuseAssociee;
  int largueur;
  int longueur;

 public CelluleGraphique (CelluleLumineuse CelluleLumineuseAssociee, int unlargueur, int unlongueur){
        largueur = unlargueur;
        longueur= unlongueur;
        celluleLumineuseAssociee= CelluleLumineuseAssociee;
}
 @Override
 protected void paintComponent(Graphics g) {
 super.paintComponent(g); 
 this.setText(celluleLumineuseAssociee.toString());
 }
}



  
    

