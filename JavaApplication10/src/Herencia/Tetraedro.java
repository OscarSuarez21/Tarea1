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
public class Tetraedro extends Figura_tridimencional{
    public double calcularArea (double lado){
        return A=Math.pow(Math.sqrt(3)*lado, 2);
    }
    public double calcularVolumen (double aristas){
        return V=Math.pow (Math.sqrt(2)/12*aristas,3);
    }
}
