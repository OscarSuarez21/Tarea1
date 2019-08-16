/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_Serializados;

import java.io.Serializable;

/**
 *
 * @author IST.LOJA
 */
public class Mascota implements Serializable {
     
  private  String Nombre;
  private int Edad;
  private int NumerodePatas;

    public Mascota() {
    }

    public Mascota(String Nombre, int Edad, int NumerodePatas) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NumerodePatas = NumerodePatas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumerodePatas() {
        return NumerodePatas;
    }

    public void setNumerodePatas(int NumerodePatas) {
        this.NumerodePatas = NumerodePatas;
    }
  
    public static void main(String[] args) {
        Mascota objeto =new Mascota ();
        objeto.setNombre("sacx");
        objeto.setEdad(1);
        objeto.setNumerodePatas(4);
        System.out.println(objeto.getNombre());
        System.out.println(objeto.getEdad());
        System.out.println(objeto.getNumerodePatas());
        
     
    }
    
}
