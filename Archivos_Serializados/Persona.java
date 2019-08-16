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
public class Persona implements Serializable {
    
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Edad;
    private Mascota mascota;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Telefono, int Edad, Mascota mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    
   
    public static void main(String[] args) {
        
        Persona p1 = new Persona(" Daniel","Suarez","099180",25,new Mascota("sacx",1,4));
        
        Persona p2 = new Persona ("Francelito","Pineda","098365",21,new Mascota("Max",2,4));
        System.out.println("la persona se llama"+p1.getNombre()+" y su mascota es " +p1.getMascota().getNombre());
    }
    
    
    
     
    }
    
