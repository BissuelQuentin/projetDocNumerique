package com.company.tools;

import com.mycompany.interfacegraphique.InterfaceAcc;
import com.mycompany.interfacegraphique.InterfaceAffichProp;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XMLParser {

    
    public static void AfficherAcc(String fileName){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            File fileXML = new File("src/main/java/com/company/tools/" + fileName);
            
            Document xml = builder.parse(fileXML);
            
            Element root = xml.getDocumentElement();
            
            String text = root.getElementsByTagName("NmIE").item(0).getTextContent();
            
            InterfaceAcc.messageTroc.setText("Acceptez vous detroquer avec : " + text + "?");
           
        }catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        } 
    }
    
    public static void AfficherProp(String fileName){
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{

            DocumentBuilder builder = factory.newDocumentBuilder();

            File fileXML = new File("src/main/java/com/company/tools/" + fileName);

            Document xml = builder.parse(fileXML);
            Element root = xml.getDocumentElement();
            
            String nomE = root.getElementsByTagName("NmIE").item(0).getTextContent();
            String nomR = root.getElementsByTagName("NmIR").item(0).getTextContent();
            String duree = root.getElementsByTagName("DureeValideMsg").item(0).getTextContent();
            String mailE = root.getElementsByTagName("MailDest").item(0).getTextContent();
            String mailR = root.getElementsByTagName("MailExp").item(0).getTextContent();      
            String titreP = root.getElementsByTagName("TitreP").item(0).getTextContent();
                     
            
            InterfaceAffichProp.nomEmetteur.setText("Nom de l'émetteur : " + nomE);
            InterfaceAffichProp.nomRecepteur.setText("Nom du récepteur : " + nomR);
            InterfaceAffichProp.duree.setText("Durée de validité : " + duree + " jour(s)");
            InterfaceAffichProp.mailEmetteur.setText("Mail de l'émetteur : " + mailE);
            InterfaceAffichProp.mailRecepteur.setText("Mail du récepteur : " + mailR);
            InterfaceAffichProp.titreProp.setText("Titre de la proposition : " + titreP);
            
          
           
        }catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        } 
    }
}
