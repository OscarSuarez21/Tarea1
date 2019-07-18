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
public class Animal {
    private String Nombre;
    private int Edad;
    private double Peso;
    private double Altura;
    private String Color;

    public Animal() {
    }

    public Animal(String Nombre, int Edad, double Peso, double Altura, String Color) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Color = Color;
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

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void nombreAnimal() {
        
        System.out.println("Hola soy un animal");
          
    }
    public String informacionAnimal (){
        String informacion= Nombre+" "+Color+" "+Edad+" "+Altura+" "+Peso;
        return informacion;
        
    }
    public static void main(String[] args) {
        Animal objeto=new Animal ();
        objeto.setNombre("Perro");
        objeto.setEdad (10);
        objeto.setAltura(15);
        objeto.setPeso (15);
        objeto.setColor ("Negro");
        System.out.println(objeto.informacionAnimal());
        
        Animal objeto1= new Animal("Gato",5,8,10,"Gris");
        System.out.println(objeto1.informacionAnimal());
    }
    
    
}
