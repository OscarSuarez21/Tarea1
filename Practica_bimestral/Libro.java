/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral;

/**
 *
 * @author Oscar
 */
public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumPagi;

    public Libro(int ISBN, String Titulo, String Autor, int NumPagi) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPagi = NumPagi;
    }

    public int getISBN() {
        return ISBN;

    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;

    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPagi() {
        return NumPagi;
    }

    public void setNumPagi(int numPagi) {
        this.NumPagi = NumPagi;
    }
    
    @Override
    public  String toString(){
        return "El libro ISBN"+ ISBN+",titulo"+Titulo+"creado por el autor"+Autor+",tiene"+NumPagi+"paginas";
        
    }
    public static void main(String[] args) {
        
        Libro 5= new Libro (2596,"las aventuras de Sherlock Holmes","Arthur Conan",150);
        Libro 6 = new Libro (6598,"Don quijote de la mancha","Migel de Cervantes",200);
        
        System.out.println(5.toString());
        System.out.println(6.toString());
        
        if (5.getNumPagi ()> 6.getNumPagi ()) {
        System.out.println(" El libro "  + 5.getTitulo () +  " tiene más números de páginas que el libro "  + 6.getTitulo ());
        
    } else{
            System.out.println(" El libro "  + 6.getTitulo () +  " tiene más números de páginas que el libro "  + 5.getTitulo ());
        
    }
    }
}
