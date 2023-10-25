/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lhermet_version_consol;


/**
 *
 * @author sacha
 */
public class GrilleDeCellules {

  CelluleLumineuse[][] matriceCellules = null;
  int nbLigne;
  int nbColonnes;
  public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLigne = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLigne][nbColonnes];
            for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }   
}
  
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindre();
            }
        }
 
    
    
    
    
    
    
    
    
    
    
    }
}
