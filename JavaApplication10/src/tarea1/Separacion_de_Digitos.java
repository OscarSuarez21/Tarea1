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
public class Separacion_de_Digitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una cifra compuesta de cinco numeros:");
        Integer numeros = entrada.nextInt();
        char[] num = numeros.toString().toCharArray();
        for (char n : num) {
            System.out.print(n + "   ");
        }
    }
}
