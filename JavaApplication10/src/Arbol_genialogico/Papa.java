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
public class Papa extends Familia {

    Mama esposa;
    Abuelo suegro;
    Abuela suegra;
    HijoP hijoP;
    HijoS hijoS;

    public Mama getEsposa() {
        return esposa;
    }

    public void setEsposa(Mama esposa) {
        this.esposa = esposa;
    }

    public Abuelo getSuegro() {
        return suegro;
    }

    public void setSuegro(Abuelo suegro) {
        this.suegro = suegro;
    }

    public Abuela getSuegra() {
        return suegra;
    }

    public void setSuegra(Abuela suegra) {
        this.suegra = suegra;
    }

    public HijoP getHijoP() {
        return hijoP;
    }

    public void setHijoP(HijoP hijoP) {
        this.hijoP = hijoP;
    }

    public HijoS getHijoS() {
        return hijoS;
    }

    public void setHijoS(HijoS hijoS) {
        this.hijoS = hijoS;
    }

    public Papa() {
        setNombres("Manuel");
        setApellidos("Suarez");
        setEdad(50);

    }

    

}
