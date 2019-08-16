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
public class Repartidor extends Empleado{
    
    

       private int Zona ;
       int numero =  0 ;

    public Repartidor(int Zona, String Nombre, int edad, double salario) {
        super(Nombre, edad, salario);
        this.Zona = Zona;
    }

  
           public  int  getNumero () {
        return numero;
           }
               public  void  setNumero ( int  numero ) {
        this . numero = numero;
    
}
                   public  boolean  Plus () {
        if ( super . getEdad () <  25  &&  this . Zona  ==  3 ) {
            
            double  Nuevo  = ( super . getSalario () +  this . Plus );
            
                        súper . setSalario ( Nuevo );
            return  true;
        }
        return ( falso );
            
        }
                   public  void  mostrarDatos () {
                       
                       System.out.println("NOMBRE: "  +  this . Nombre  +  " EDAD: "  +  this . edad +  " SALARIO: "  +  this . salario +  " Zona "  +  this . Zona );
                   }

    
}