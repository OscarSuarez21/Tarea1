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
public class Empleado {
    private String Nombre;

    public Empleado() {
    }

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
        
        System.out.println("Empleado "  + Nombre);
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public  String  toString () {
        return " Empleado "  + Nombre;
    }
    
}
