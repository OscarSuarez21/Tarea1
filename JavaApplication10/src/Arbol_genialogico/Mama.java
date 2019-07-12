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
public class Mama extends Familia {

    Papa esposo;
    Abuelo papa;
    Abuela mama;
    HijoP hijoP;
    HijoS hijoS;

    public Papa getEsposo() {
        return esposo;
    }

    public void setEsposo(Papa esposo) {
        this.esposo = esposo;
    }

    public Abuelo getPapa() {
        return papa;
    }

    public void setPapa(Abuelo papa) {
        this.papa = papa;
    }

    public Abuela getMama() {
        return mama;
    }

    public void setMama(Abuela mama) {
        this.mama = mama;
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

    public Mama() {
        setNombres("Lilia");
        setApellidos("Granda");
        setEdad(46);

    }

//    fd

}
