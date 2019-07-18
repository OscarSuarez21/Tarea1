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
public class Anfibios extends Animal{
     private boolean Piel ;
    private String VertebradosTeresres ;

    public Anfibios() {
    }

    public Anfibios(boolean Piel, String VertebradosTeresres, String Nombre, int Edad, double Peso, double Altura, String Color) {
        super(Nombre, Edad, Peso, Altura, Color);
        this.Piel = Piel;
        this.VertebradosTeresres = VertebradosTeresres;
    }
    
    

    public boolean isPiel() {
        return Piel;
    }

    public void setPiel(boolean Piel) {
        this.Piel = Piel;
    }

    public String getVertebradosTeresres() {
        return VertebradosTeresres;
    }

    public void setVertebradosTeresres(String VertebradosTeresres) {
        this.VertebradosTeresres = VertebradosTeresres;
    }
    
    
    
}
