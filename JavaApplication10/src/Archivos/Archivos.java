/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Archivos {
//    public static void main(String[] args) {
//        File archivo =new File("C:\\Users\\IST.LOJA\\Desktop/ejemplo.txt"); //creando un objeto d la clase archivo
//        //en las comillas va el nombre y la dirreccion del archivo
//        System.out.println(archivo.exists());
//        System.out.println(archivo.isDirectory());//para saber si es una carpeta o un archivo
//        System.out.println(archivo.isFile());
//        //para saber si un archivo esta oculto o no 
//        System.out.println(archivo.isHidden());
//        //para saber ultima fecha d modificacion
//        System.out.println(archivo.lastModified());
//        archivo.delete();//para borrar archivos
//        
//        File carpeta=new File ("\\Users\\IST.LOJA\\Desktop/ejemplo.txt");
//        //carpeta.list devuelve un arreglo con los archivos de la carpeta
//        String [] arregloarchivo=carpeta.list();
//        for(int i=0; i < arregloarchivo.length; i++){
//            System.out.println(arregloarchivo[i]);
//            
//            
//        }
//    }

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
        System.out.println("escriba un archivo");    
String texto =entrada.nextLine();

//    public void leerarchivo(String direccion) {
        Archivos objeto = new Archivos();
        
        objeto.leerArchivos("C:\\Users\\IST.LOJA\\Desktop\\ejemplo.txt");
        objeto.escribirArchivo("C:\\Users\\IST.LOJA\\Desktop\\ejemplo.txt",texto);
        
        
        
    }

    public void leerArchivos(String direccion) {
        File archivo = new File(direccion);
        try {
            FileReader reader = new FileReader(archivo);//nos convirete el archivo en un objeto
            BufferedReader recorrido = new BufferedReader(reader);
            String linea;
            while ((linea = recorrido.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {//mostar objeto en pantalla
            System.out.println(e);

        }
    }
    public void escribirArchivo(String direccion, String texto){
        
        
        try{
            
        FileWriter archivo =new FileWriter (direccion);
        PrintWriter escribir = new PrintWriter(archivo);
        escribir.println(texto);
        
        archivo.close();
        
    }
        catch (Exception e){
            System.out.println(e);
        }
}
}