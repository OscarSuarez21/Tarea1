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
public class Reptiles extends Animal {
    
    private boolean Escamas;
    private int NumerodeHuevos;

    public Reptiles() {
    }

    public Reptiles(boolean Escamas, int NumerodeHuevos, String Nombre, int Edad, double Peso, double Altura, String Color) {
        super(Nombre, Edad, Peso, Altura, Color);
        this.Escamas = Escamas;
        this.NumerodeHuevos = NumerodeHuevos;
    }
    

    public boolean isEscamas() {
        return Escamas;
    }

    public void setEscamas(boolean Escamas) {
        this.Escamas = Escamas;
    }

    public int getNumerodeHuevos() {
        return NumerodeHuevos;
    }

    public void setNumerodeHuevos(int NumerodeHuevos) {
        this.NumerodeHuevos = NumerodeHuevos;
    }
    
    
}
