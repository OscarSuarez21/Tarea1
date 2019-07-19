/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       
        System.out.println("Ingrese un numero");
        int Numero =0;
        try{//ponemos el cogigo m que queremos proteger
        Numero = entrada.nextInt();
        
        }catch(Exception e){ //ponemos la excepcion a capturar
            System.out.println("se genero un error"+e);
            System.out.println("Por favor ingrese un numero correcto");
        }
        System.out.println("El numero ingresado es"+Numero);
        try{
        int resultado=Numero/0;
        System.out.println(resultado);
    }catch(Exception e){
            System.out.println("No se puede dividir para cero");
            
    }
    } 
}
