/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



/**
 *
 * @author Oscar
 */
public class Ruta_Fichero {
    public static void main(String[] args) {
        
        String ruta =JOptionPane.showInputDialog("Introducir la ruta del archivo");
        String texto = JOptionPane.showInputDialog("Escribir el texto que quieras introducir en el archivo");
        
        escribirFichero (ruta, texto);
        mostrarFicheroMay (ruta);
        
    }
    public static void escribirFichero(String nomFich, String texto){
        try (FileWriter fw = new FileWrite (nomFich);){
            
            fw. escribir (texto);
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S"+e);
        }
        
    }
    public static void mostrarFicheroMay (String nomFich){
        try (FileReader fr =new FileReader (nomFich)){
           int valor = fr .read();
           while (valor !=-1){
                char caracter = (char) valor;
                if(caracter > = 97 && caracter <= 122){
                    caracter - = 32;
                }else if (caracter > = 65 && caracter <= 90){
                    
                    caracter += 32;
                }
                System.out.println(caracter);
                valor = fr.read();
           }
        }catch (IOException e){
            System.out.println("33");
        }
        
    }

    
}
    