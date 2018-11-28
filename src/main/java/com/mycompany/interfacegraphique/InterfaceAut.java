/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacegraphique;

import com.company.tools.XmlTools;
import java.awt.Color;
import java.io.StringWriter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author DELL XPS
 */
public class InterfaceAut extends java.awt.Frame {
  static String em;
    /**
     * Creates new form InterfaceAut
     */
    public InterfaceAut() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        pan = new javax.swing.JPanel();
        mailEmetteur = new javax.swing.JLabel();
        nomEmetteur = new javax.swing.JLabel();
        titreFenetreProp = new javax.swing.JLabel();
        nomRecepteur = new javax.swing.JLabel();
        texteMailEmetteur = new javax.swing.JTextField();
        duree = new javax.swing.JLabel();
        descDemande = new javax.swing.JLabel();
        texteEmetteur = new javax.swing.JTextField();
        textMailRecepteur = new javax.swing.JTextField();
        texteRecepteur = new javax.swing.JTextField();
        boutonEnvoyerDemande = new javax.swing.JButton();
        mailRecepteur1 = new javax.swing.JLabel();
        scrollDescObjPropose = new javax.swing.JScrollPane();
        texteDescDemande = new javax.swing.JTextPane();
        choixNbJour = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setLocationRelativeTo(null);
        setMinimumSize(new java.awt.Dimension(520, 330));
        setPreferredSize(new java.awt.Dimension(535, 490));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pan.setPreferredSize(new java.awt.Dimension(540, 320));
        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mailEmetteur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailEmetteur.setText("Mail émetteur :");
        mailEmetteur.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(mailEmetteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 20));

        nomEmetteur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomEmetteur.setText("Nom émetteur : *");
        nomEmetteur.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(nomEmetteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 20));

        titreFenetreProp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titreFenetreProp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreFenetreProp.setText("Je souhaite avoir l'autorisation de troque : ");
        titreFenetreProp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titreFenetreProp.setPreferredSize(new java.awt.Dimension(240, 40));
        pan.add(titreFenetreProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 50));

        nomRecepteur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomRecepteur.setText("Nom récepteur : *");
        nomRecepteur.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(nomRecepteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 20));

        texteMailEmetteur.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texteMailEmetteur.setNextFocusableComponent(textMailRecepteur);
        pan.add(texteMailEmetteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 330, 20));

        duree.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        duree.setText("Durée de validité : *");
        duree.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(duree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 20));

        descDemande.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        descDemande.setText("Description :");
        descDemande.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(descDemande, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, -1));

        texteEmetteur.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texteEmetteur.setNextFocusableComponent(texteRecepteur);
        pan.add(texteEmetteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 330, 20));

        textMailRecepteur.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textMailRecepteur.setNextFocusableComponent(texteDescDemande);
        pan.add(textMailRecepteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 330, -1));

        texteRecepteur.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texteRecepteur.setNextFocusableComponent(choixNbJour);
        pan.add(texteRecepteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, 20));

        boutonEnvoyerDemande.setBackground(new java.awt.Color(102, 204, 255));
        boutonEnvoyerDemande.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boutonEnvoyerDemande.setText("Envoyer la demande d'autorisation");
        boutonEnvoyerDemande.setNextFocusableComponent(texteEmetteur);
        boutonEnvoyerDemande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEnvoyerDemandeActionPerformed(evt);
            }
        });
        pan.add(boutonEnvoyerDemande, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 370, 40));

        mailRecepteur1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailRecepteur1.setText("Mail récepteur : ");
        mailRecepteur1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pan.add(mailRecepteur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, -1));

        texteDescDemande.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texteDescDemande.setAutoscrolls(false);
        texteDescDemande.setNextFocusableComponent(boutonEnvoyerDemande);
        scrollDescObjPropose.setViewportView(texteDescDemande);

        pan.add(scrollDescObjPropose, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 330, 100));

        choixNbJour.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        choixNbJour.setNextFocusableComponent(texteMailEmetteur);
        choixNbJour.setValue(1);
        choixNbJour.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                choixNbJourStateChanged(evt);
            }
        });
        pan.add(choixNbJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 160, 50, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Jour(s)");
        pan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 40));

        add(pan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void boutonEnvoyerDemandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEnvoyerDemandeActionPerformed
        int err = 0;
        
        
        if(texteEmetteur.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Le champs \"Nom émetteur\" doit être rempli!");
            err = 1;
        }
        else {
       em = texteEmetteur.getText();
        
        }
        
        if(texteRecepteur.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Le champs \"Nom récepteur\" doit être rempli!");
            err = 1;
        }
        
     
        if(err != 1){
            XmlTools xmlTools = new XmlTools();
            if(xmlTools.creerAuth(texteEmetteur.getText(), texteRecepteur.getText(), (Integer)choixNbJour.getValue(),texteMailEmetteur.getText(), textMailRecepteur.getText(), texteDescDemande.getText()))
                JOptionPane.showMessageDialog(null,"Demande cree avec succes");
            else
                JOptionPane.showMessageDialog(null,"Erreur veuillez resseayer plus tard");
                
        } 
    }//GEN-LAST:event_boutonEnvoyerDemandeActionPerformed

    private void choixNbJourStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_choixNbJourStateChanged
        JSpinner s = (JSpinner) evt.getSource();
         
         int value = (Integer) s.getValue();
         
         if (value < 1){
             choixNbJour.setValue(1);
         }
    }//GEN-LAST:event_choixNbJourStateChanged

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InterfaceAut().setVisible(true);
            
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonEnvoyerDemande;
    private javax.swing.JSpinner choixNbJour;
    private javax.swing.JLabel descDemande;
    private javax.swing.JLabel duree;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mailEmetteur;
    private javax.swing.JLabel mailRecepteur1;
    private javax.swing.JLabel nomEmetteur;
    private javax.swing.JLabel nomRecepteur;
    private javax.swing.JPanel pan;
    private javax.swing.JScrollPane scrollDescObjPropose;
    private javax.swing.JTextField textMailRecepteur;
    private javax.swing.JTextPane texteDescDemande;
    private javax.swing.JTextField texteEmetteur;
    private javax.swing.JTextField texteMailEmetteur;
    private javax.swing.JTextField texteRecepteur;
    private javax.swing.JLabel titreFenetreProp;
    // End of variables declaration//GEN-END:variables
}
