<<<<<<< HEAD

package com.mycompany.interfacegraphique;


import com.company.tools.DriverManage;
import static com.mycompany.interfacegraphique.InterfaceAut.setU;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.company.tools.XMLParser;
import com.company.tools.XmlTools;

public class InterfaceAcc extends java.awt.Frame {

    static DriverManage setR=new DriverManage();
    String type="accepAuto";
    String fichier= "xml.xml";
    XMLParser p= new XMLParser();
    String emetteur= p.recupererEmetteur(fichier);
    String recepteur= p.recupererRecepteur(fichier);
    int msgId= p.recupererIdMsg(fichier);
    
    public InterfaceAcc() {
        initComponents();
    }

  
  
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void boutonAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAccepterActionPerformed

        String acc = "Accepte";
        Statement s = setR.ConnectionDB();
        setR.repAuto(s, acc);
        int idF=setR.ajoutFichier(s,emetteur,recepteur);
        
        JOptionPane.showMessageDialog(null, "Demande acceptée");
    }//GEN-LAST:event_boutonAccepterActionPerformed

    private void boutonRefuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRefuserActionPerformed
        String ref = "Refuse";
        Statement s = setR.ConnectionDB();
        setR.repAuto(s, ref);
        setR.supprimeFic(s,emetteur, recepteur);
        JOptionPane.showMessageDialog(null, "Demande Refusée");

         XmlTools xmlTools = new XmlTools();
         
        xmlTools.accepterAuth("xml.xml");
    }//GEN-LAST:event_boutonAccepterActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Statement s = setU.ConnectionDB();
            System.out.println("connexion réussie");

            new InterfaceAcc().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAccepter;
    private javax.swing.JButton boutonRefuser;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel messageTroc;
    private javax.swing.JLabel titreFenetreAcc;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
=======


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacegraphique;

import com.company.tools.DriverManage;
import static com.mycompany.interfacegraphique.InterfaceAut.setU;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.company.tools.XMLParser;
import com.company.tools.XmlTools;
import static java.time.Instant.now;
import java.util.Date;

/**
 *
 * @author DELL XPS
 */
public class InterfaceAcc extends java.awt.Frame {
    DriverManage setR= new DriverManage();
    Statement s= setR.ConnectionDB();
    String emetteur = XMLParser.recupererEmetteur("xml.xml");
    String recepteur = XMLParser.recupererRecepteur("xml.xml");
    int msgId = XMLParser.recupererIdMsg("xml.xml");
    int iddmd = setR.recupID(s, emetteur, recepteur);
    String type="repAuth";

    /**
     * Creates new form InterfaceAcc
     */
    public InterfaceAcc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        messageTroc = new javax.swing.JLabel();
        boutonRefuser = new javax.swing.JButton();
        boutonAccepter = new javax.swing.JButton();
        titreFenetreAcc = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(540, 170));
        setPreferredSize(new java.awt.Dimension(535, 220));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messageTroc.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        messageTroc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageTroc.setText("Autorisez vous [Nom emetteur] à troquer avec vous? ");
        jPanel1.add(messageTroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 40));
        messageTroc.getAccessibleContext().setAccessibleName("");
        messageTroc.getAccessibleContext().setAccessibleDescription("");

        boutonRefuser.setBackground(new java.awt.Color(255, 204, 102));
        boutonRefuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boutonRefuser.setText("Refuser");
        boutonRefuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRefuserActionPerformed(evt);
            }
        });
        jPanel1.add(boutonRefuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, 60));

        boutonAccepter.setBackground(new java.awt.Color(204, 255, 102));
        boutonAccepter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boutonAccepter.setText("Accepter");
        boutonAccepter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAccepterActionPerformed(evt);
            }
        });
        jPanel1.add(boutonAccepter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 170, 60));

        titreFenetreAcc.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titreFenetreAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreFenetreAcc.setText("Vous avez une demande de troque : ");
        titreFenetreAcc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titreFenetreAcc.setPreferredSize(new java.awt.Dimension(240, 40));
        jPanel1.add(titreFenetreAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 50));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void boutonAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAccepterActionPerformed
        XmlTools xmlTools = new XmlTools();

        xmlTools.accepterAuth("xml.xml");
        String acc = "Accepte";
        int idF = 5;
        int idrep = setR.repAuto(s, acc, iddmd);
        int dureeV = 0;
        Date now = new Date();
        String date = now.toString();

        setR.ajoutMessage(s, type, msgId, idF, idrep, dureeV, date);
        JOptionPane.showMessageDialog(null, "Demande acceptée");
    }//GEN-LAST:event_boutonAccepterActionPerformed

    private void boutonRefuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRefuserActionPerformed
        XmlTools xmlTools = new XmlTools();

        xmlTools.refuserAuth("xml.xml");
    }//GEN-LAST:event_boutonRefuserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            InterfaceAcc ia = new InterfaceAcc();
            XMLParser.AfficherAcc("xml.xml");
            ia.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAccepter;
    private javax.swing.JButton boutonRefuser;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel messageTroc;
    private javax.swing.JLabel titreFenetreAcc;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> 5d254734ff5ddd82e574555a57639091f016672e
