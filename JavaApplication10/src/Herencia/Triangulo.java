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
public class Triangulo extends Figura_bidimencional{
    public double calcularPerimetro(double lado1, double lado2, double lado3){
       
        return lado1+lado2+lado3;
    }
    public double calcularArea (double base, double altura){
        
        return (base*altura) / 2;
    }
    
}
