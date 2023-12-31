/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_lhermet_version_consol;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author sacha
 */
public class FenetrePrincipal extends javax.swing.JFrame {
     GrilleDeCellules grille;
    int nbCoups;
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipal() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;

        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);

        initialiserPartie();

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 40, 40);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);

        }
         PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
 getContentPane().add(PanneauBoutonHorizontaux, new
org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, nbColonnes * 40, 1 * 40));
 this.pack();
 this.revalidate();
 // création du panneau de boutons verticaux (pour les lignes)
 for (i = 0; i < nbLignes; i++) {
 JButton bouton_Colonnes = new JButton();
 ActionListener ecouteurClick = new ActionListener() {
 final int j = i;
 @Override
 public void actionPerformed(ActionEvent e) {
 grille.activerColonneDeCellules(j);
repaint();
 }
 };
 bouton_Colonnes.addActionListener(ecouteurClick);
 PanneauBoutonHorizontaux.add(bouton_Colonnes);

 }
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        btndiag = new javax.swing.JButton();
        btndiaginv = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(51, 255, 102));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 280, 200));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 260, 80));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 210));

        btndiag.setText("btndiag");
        getContentPane().add(btndiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btndiaginv.setText(" btndiaginv");
        getContentPane().add(btndiaginv, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btndiaginvActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        endgame();
    }                                          

    private void btndiagActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        endgame();
        repaint();
    }                                      
    public void endgame() {
        if (grille.cellulesToutesEteintes()) {

           
            btndiaginv.setEnabled(false);
            btndiag.setEnabled(false);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipal().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btndiag;
    private javax.swing.JButton btndiaginv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
