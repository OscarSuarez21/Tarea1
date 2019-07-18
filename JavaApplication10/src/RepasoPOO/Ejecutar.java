/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author IST.LOJA
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        Animal objeto=new Animal("Jirafa",10,15,6,"Amarilla");
        Ave objetoave=new Ave (8,false,"Pato",2,7,1,"Blanco");
         Mamifero objetomamifero= new Mamifero(12,true,"Vaca",5,13,2,"Pintada");
         
         Anfibios objetoanfibios=new Anfibios(true,"Vertebrados","Nombre",2,1,1,"Verde"); 
         Reptiles objetoreptiles=new Reptiles (true,30,"Tortuga",15,9,2,"cafe" );        
         System.out.println(objeto.informacionAnimal());
         System.out.println(objetoave.informacionAnimal());
         System.out.println(objetomamifero.informacionAnimal());
         System.out.println(objetoanfibios.informacionAnimal());
        System.out.println(objetoreptiles.informacionAnimal());
    }
    
}
