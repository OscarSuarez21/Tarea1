/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral.Empleados;

/**
 *
 * @author Oscar
 */
public class Empleado {
    
    	       protected String Nombre ;
	    protected  int edad;
	     protected double salario ;
	     int  más =  300 ;

    public Empleado(String Nombre, int edad, double salario) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

     public boolean resumen Plus ();
     
     public  void  mostrarDatos () {
         System.out.println("NOMBRE: "  +  this . Nombre  +  " EDAD: "  +  this . edad +  " SALARIO: "  +  this . salario);
         
     }
     
             
	

}