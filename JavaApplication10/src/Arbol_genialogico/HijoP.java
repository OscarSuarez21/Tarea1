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
public class HijoP extends Familia {

    Mama mama;
    Papa papa;
    Abuela abuela;
    Abuelo abuelo;

    public Mama getMama() {
        return mama;
    }

    public void setMama(Mama mama) {
        this.mama = mama;
    }

    public Papa getPapa() {
        return papa;
    }

    public void setPapa(Papa papa) {
        this.papa = papa;
    }

    public Abuela getAbuela() {
        return abuela;
    }

    public void setAbuela(Abuela abuela) {
        this.abuela = abuela;
    }

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
    }

    public HijoP() {
        setNombres("Oscar ");
        setApellidos("Suarez");
        setEdad(25);

    }

}
//fghfg