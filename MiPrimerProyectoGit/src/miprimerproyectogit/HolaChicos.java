/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyectogit;
/**
 *
 * @author ornef
 */
public class HolaChicos {
    private String unsaludo;
    
    public HolaChicos(){};
    
    public HolaChicos (String unsaludo){
        this.unsaludo = unsaludo;
    }
    
    public String getUnsaludo (){
        return unsaludo;
    }
    public void setUnsaludo (String unsaludo){
        this.unsaludo = unsaludo;
    }
    
    @Override
    public String toString (){
        return "Hoy saludó:" + unsaludo;
    }
}
