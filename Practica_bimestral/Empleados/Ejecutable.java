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
public class Ejecutable {
    
        public  static  void  main ( String [] args ) {
            
            


        Comercial c1 =  new  Comercial ( 3000000 , " jhon " , 20 , 1000 );
        Repartidor  R1  =  new  Repartidor ( 7 , " pablo " , 22 , 350 );
        Repartidor  R2  =  new  Repartidor ( 6 , " vicente " , 25 , 350 );


        c1 . Más ();
        R1 . Más();
        R2 . Más();
        c1 . mostrarDatos ();
        R1 . mostrarDatos ();
        R2 . mostrarDatos ();
            System.out.println(c1 . getSalario ());
    }


}
}
