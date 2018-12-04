/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tools;

import com.mycompany.interfacegraphique.InterfaceCreaProp;
import static com.mycompany.interfacegraphique.InterfaceCreaProp.icp;
import static com.mycompany.interfacegraphique.InterfaceCreaProp.pan;
import static com.mycompany.interfacegraphique.InterfaceCreaProp.sizeY;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author qbiss
 */
public class Parametres {

    String nom;
    String valeur;
    public JLabel TexteNom;
    public JLabel TexteValeur;
    public static int posYCurrentParamProp = 310;
    public static int posYCurrentParamDesire = 310;
    public static int sizeYParam = 30;
    public static int positionCurrentBouton = 310;

    public Parametres(String nom, String valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }
    
    
    public void afficherParam(int type, int nbParam) {
        Dimension d = new Dimension(1570, sizeY + sizeYParam);
        if (type == 0) {
            this.TexteNom = new JLabel();
            this.TexteValeur = new JLabel();

            this.TexteNom.setText("Paramètre n°" + nbParam + " : " + this.nom);
            this.TexteNom.setFont(new java.awt.Font("Arial", 1, 14));
            this.TexteNom.setLocation(530, posYCurrentParamProp);

            this.TexteValeur.setText(this.valeur);
            this.TexteValeur.setFont(new java.awt.Font("Arial", 1, 14));
            this.TexteValeur.setLocation(790, posYCurrentParamProp);

            if (posYCurrentParamProp >= posYCurrentParamDesire){
                InterfaceCreaProp.pan.add(this.TexteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, posYCurrentParamProp, 250, 20));
                InterfaceCreaProp.pan.add(this.TexteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, posYCurrentParamProp, 70, 20));

                Dimension df = new Dimension(1570, sizeY + sizeYParam);
                icp.setSize(df);
                icp.setPreferredSize(df);
                pan.setSize(d);
                pan.setPreferredSize(d);

                posYCurrentParamProp += sizeYParam;
                InterfaceCreaProp.posYBouton += sizeYParam;
                sizeY += sizeYParam;
            }
            else{
                InterfaceCreaProp.pan.add(this.TexteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, posYCurrentParamProp, 250, 20));
                InterfaceCreaProp.pan.add(this.TexteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, posYCurrentParamProp, 70, 20));

                Dimension df = new Dimension(1570, sizeY);
                icp.setSize(df);
                icp.setPreferredSize(df);
                pan.setSize(d);
                pan.setPreferredSize(d);

                posYCurrentParamProp += sizeYParam;
            }
            
            icp.revalidate();
        }

        if (type == 1) {
            this.TexteNom = new JLabel();
            this.TexteValeur = new JLabel();

            this.TexteNom.setText("Paramètre n°" + nbParam + " : " + this.nom);
            this.TexteNom.setFont(new java.awt.Font("Arial", 1, 14));
            this.TexteNom.setLocation(1050, posYCurrentParamDesire);

            this.TexteValeur.setText(this.valeur);
            this.TexteValeur.setFont(new java.awt.Font("Arial", 1, 14));
            this.TexteValeur.setLocation(1300, posYCurrentParamDesire);

            if (posYCurrentParamDesire >= posYCurrentParamProp) {

                InterfaceCreaProp.pan.add(this.TexteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, posYCurrentParamDesire, 250, 20));
                InterfaceCreaProp.pan.add(this.TexteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, posYCurrentParamDesire, 70, 20));

                Dimension df = new Dimension(1570, sizeY + sizeYParam);
                icp.setSize(df);
                icp.setPreferredSize(df);
                pan.setSize(d);
                pan.setPreferredSize(d);

                posYCurrentParamDesire += sizeYParam;
                sizeY += sizeYParam;
            } else {
                InterfaceCreaProp.pan.add(this.TexteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, posYCurrentParamDesire, 250, 20));
                InterfaceCreaProp.pan.add(this.TexteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, posYCurrentParamDesire, 70, 20));

                Dimension df = new Dimension(1570, sizeY);
                icp.setSize(df);
                icp.setPreferredSize(df);
                pan.setSize(d);
                pan.setPreferredSize(d);

                posYCurrentParamDesire += sizeYParam;
                
                icp.revalidate();
            }
        }
    }

}
