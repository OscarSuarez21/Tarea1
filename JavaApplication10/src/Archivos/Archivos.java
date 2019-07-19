/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author IST.LOJA
 */
public class Archivos {
    public static void main(String[] args) {
        File archivo =new File("C:\\Users\\IST.LOJA\\Desktop/ejemplo.txt"); //creando un objeto d la clase archivo
        //en las comillas va el nombre y la dirreccion del archivo
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());//para saber si es una carpeta o un archivo
        System.out.println(archivo.isFile());
        //para saber si un archivo esta oculto o no 
        System.out.println(archivo.isHidden());
        //para saber ultima fecha d modificacion
        System.out.println(archivo.lastModified());
        archivo.delete();//para borrar archivos
        
        File carpeta=new File ("\\Users\\IST.LOJA\\Desktop/");
        //carpeta.list devuelve un arreglo con los archivos de la carpeta
        String [] arregloarchivo=carpeta.list();
        for(int i=0; i < arregloarchivo.length; i++){
            System.out.println(arregloarchivo[i]);
            
            
        }
    }
    
}
