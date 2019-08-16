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
public class Comercial extends Empleado{
    
      private double Comision;

    public Comercial(double Comision, String Nombre, int edad, double salario) {
        super(Nombre, edad, salario);
        this.Comision = Comision;
    }
          public  boolean  Plus () {
        if ( super . getEdad () >  30  &&  this . Comision  >  300 ) {
            double  NuevoSalario  = ( super . getSalario () +  this . Plus );
            súper . setSalario ( NuevoSalario );
            return  true ;
        }
        if return false;
          }
           public  void  mostrarDatos () {
               System.out.println("NOMBRE: "  +  this . Nombre  +  " EDAD: "  +  this . edad +  " SALARIO: "  +  this . salario +  " COMISION: "  +  this . Comision);
           }

   
            
    
}
