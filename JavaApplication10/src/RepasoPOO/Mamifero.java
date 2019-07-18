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
public class Mamifero extends Animal {
    
    private int TiepodeGestacion;
    private boolean Pelaje;

    public Mamifero() {
    }

    public Mamifero(int TiepodeGestacion, boolean Pelaje, String Nombre, int Edad, double Peso, double Altura, String Color) {
        super(Nombre, Edad, Peso, Altura, Color);
        this.TiepodeGestacion = TiepodeGestacion;
        this.Pelaje = Pelaje;
    }
    
    

    public int getTiepodeGestacion() {
        return TiepodeGestacion;
    }

    public void setTiepodeGestacion(int TiepodeGestacion) {
        this.TiepodeGestacion = TiepodeGestacion;
    }

    public boolean isPelaje() {
        return Pelaje;
    }

    public void setPelaje(boolean Pelaje) {
        this.Pelaje = Pelaje;
    }
    
    
    
}
