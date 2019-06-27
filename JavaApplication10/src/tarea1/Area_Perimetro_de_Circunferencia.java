package tarea1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Area_Perimetro_de_Circunferencia {
    public static void main(String arg[]){
 
 Scanner entrada = new Scanner(System.in);
 int radio;
 System.out.println("Por favor introduzca un radio y podra obtener el diametro, el perimetro y el area:");
 radio = entrada.nextInt();
 System.out.printf("\nEl diametro del circulo es:%d", 2*radio);
 System.out.printf("\nEl perimetro del circulo es:%f", 2*Math.PI*radio);
 System.out.printf("\nEl area del circulo es:%f ", Math.PI*radio*radio);
    
}
    
}
