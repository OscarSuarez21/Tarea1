/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_genialogico;

/**
 *
 * @author IST.LOJA
 */
public class Abuelo extends Familia {
   HijoP nietoP;
    HijoS nietoS;
    Papa hierno;
    Mama hija;

    public HijoP getNietoP() {
        return nietoP;
    }

    public void setNietoP(HijoP nietoP) {
        this.nietoP = nietoP;
    }

    public HijoS getNietoS() {
        return nietoS;
    }

    public void setNietoS(HijoS nietoS) {
        this.nietoS = nietoS;
    }

    public Papa getHierno() {
        return hierno;
    }

    public void setHierno(Papa hierno) {
        this.hierno = hierno;
    }

    public Mama getHija() {
        return hija;
    }

    public void setHija(Mama hija) {
        this.hija = hija;
    }

    
    
    public Abuelo(){
    setNombres("Guillermo");
    setApellidos("Granda");
    setEdad(93);
    
}
        
        
  
    
     
    }

    
    
    

