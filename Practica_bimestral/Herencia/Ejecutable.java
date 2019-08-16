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
public class Ejecutable {
    public static void main(String[] args) {
        
        Empleado  Emp  =  new  Empleado ( " jhonatan " );
        Directivo  Dir  =  new  Directivo ( " vicente " );
        Operario  Ope  =  new  Operario ( " Jhon " );
        Oficial  Ofi  =  new Oficial ( " francel " );
        Tecnico  Tec  =  new  Tecnico ( " celio " );
        
        System.out.println(Emp);
        System.out.println(Dir);
        System.out.println(Ope);
        System.out.println(Ofi);
        System.out.println(Tec);
        
        
         
    }
    
}
