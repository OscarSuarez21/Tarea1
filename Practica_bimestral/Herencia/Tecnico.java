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
public class Tecnico extends Operario{

    public Tecnico(String Nombre) {
        super(Nombre);
        System.out.println("Operario");
    }
        public  String  toString () {
        return  super . toString () +  " -> Tecnico " ;
    }
    
    
}
