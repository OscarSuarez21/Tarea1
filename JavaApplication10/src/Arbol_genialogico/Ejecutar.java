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
public class Ejecutar {

    public static void main(String[] args) {

        HijoP hijoP = new HijoP();
        HijoS hijoS = new HijoS();
        Mama mama = new Mama();
        Papa papa = new Papa();
        Abuelo abuelo = new Abuelo();
        Abuela abuela = new Abuela();

        hijoP.setPapa(papa);
        hijoP.setMama(mama);
        hijoS.setPapa(papa);
        hijoS.setMama(mama);
        mama.setHijoP(hijoP);
        papa.setHijoP(hijoP);
        mama.setHijoS(hijoS);
        papa.setHijoS(hijoS);
        mama.setEsposo(papa);
        papa.setEsposa(mama);

        System.out.println("nombre del padre es " + hijoP.getPapa().getNombres());
        System.out.println("nombre del hijoP de " + mama.getNombres() + " es: " + mama.getHijoP().getNombres());
        System.out.println("nombre del hijoP de " + papa.getNombres() + " es: " + papa.getHijoP().getNombres());
        System.out.println("nombre de la hijoS de " + mama.getNombres() + " es: " + hijoS.getNombres());
        System.out.println("el esposos de " + mama.getNombres() + " es: " + mama.getEsposo().getNombres());

    }
}