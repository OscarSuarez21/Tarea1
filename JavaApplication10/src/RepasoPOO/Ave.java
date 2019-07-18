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
public class Ave extends Animal{
    
    private int Numerodehuevos;
    private boolean Vuela;

    public Ave() {
    }

    public Ave(int Numerodehuevos, boolean Vuela, String Nombre, int Edad, double Peso, double Altura, String Color) {
        super(Nombre, Edad, Peso, Altura, Color);
        this.Numerodehuevos = Numerodehuevos;
        this.Vuela = Vuela;
    }
    
    

    public int getNumerodehuevos() {
        return Numerodehuevos;
    }

    public void setNumerodehuevos(int Numerodehuevos) {
        this.Numerodehuevos = Numerodehuevos;
    }

    public boolean isVuela() {
        return Vuela;
    }

    public void setVuela(boolean Vuela) {
        this.Vuela = Vuela;
    }
    
   
   
    
}
