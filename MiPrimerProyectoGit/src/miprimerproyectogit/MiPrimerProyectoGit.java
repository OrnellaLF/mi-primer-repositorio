/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyectogit;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ornef
 */
public class MiPrimerProyectoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HolaChicos> hola = new ArrayList();
        String saludo = "";
        
        hola.add(new HolaChicos("Ornella Leiva Fioravanti"));
        hola.add(new HolaChicos ("Una prueba"));
        hola.add (new HolaChicos ("Otra prueba"));
        
        for (int i=0; i < hola.size(); i++){
            saludo+= hola.get(i).getUnsaludo() + "\n";
        }
  
        JOptionPane.showMessageDialog(null, saludo, "SALUDOS DE:", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
