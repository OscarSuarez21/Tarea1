/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral;

/**
 *
 * @author Oscar
 */
public class Main_Fraccion {
    public static void main(String[] args) {
        Fracciones f = new Fracciones(18, 27);
        System.out.println(f.toString());
        f.simplificar();
        System.out.println(f.toString());
        f.procesar();
        System.out.println(f.toString());
        System.out.println(f.getResultado());
    
    
}
}