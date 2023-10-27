/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_lhermet_version_consol;

/**
 *
 * @author sacha
 */
public class LightOff_LHERMET_version_consol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse l1 = new CelluleLumineuse(); 

        CelluleLumineuse l2 = new CelluleLumineuse(); 

       GrilleDeCellules grille = new GrilleDeCellules(7, 7);

        grille.melangerMatriceAleatoirement(20);

        System.out.println(grille);

        Partie partie =new Partie();

        partie.lancerPartie();
        
    
    
}
}
                                                                                                                                                                                                                                                                                                                          

