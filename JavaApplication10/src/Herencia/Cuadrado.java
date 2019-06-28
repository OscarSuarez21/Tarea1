/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author IST.LOJA
 */
public class Cuadrado extends Figura_bidimencional {
    public double calcularArea (double lado){
     return lado*Math.pow(lado,2);   
    }
    public double calcularPerimetro (double lado){
        return lado+lado+lado+lado;
    }
}
