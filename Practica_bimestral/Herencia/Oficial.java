/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral.Herencia;

/**
 *
 * @author Oscar
 */
public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String Nombre) {
        super(Nombre);
        System.out.println("Oficial");
        
    }
        public  String  toString () {
        return  super . toString () +  " -> Oficial " ;
    }
    
    
    
}
